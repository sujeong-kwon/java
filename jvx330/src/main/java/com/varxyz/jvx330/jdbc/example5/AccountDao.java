package com.varxyz.jvx330.jdbc.example5;

import static java.sql.Types.*;

import java.util.Date;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.varxyz.jvx330.jdbc.Account;

@Component("accountDao")
public class AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AccountDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account (accountNum, accType, balance, interestRate, overAmount, customerId)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		SavingsAccount sa = null;
		CheckingAccount ca = null;
		Object[] args = null;
		int[] types = new int[] {CHAR, CHAR, DOUBLE, DOUBLE, DOUBLE, BIGINT};
		
		if(account instanceof SavingsAccount) {
			sa = (SavingsAccount)account;
			args = new Object[] {
				sa.getAccountNum(), String.valueOf(sa.getAccType()),
				sa.getBalance(), sa.getInterestRate(),
				0.0, sa.getCustomer().getCid()
			};
		}else {
			ca = (CheckingAccount)account;
			args = new Object[] {
					ca.getAccountNum(), String.valueOf(ca.getAccType()),
					ca.getBalance(), 0.0, ca.getOverdraftAmount(),
					sa.getCustomer().getCid()
			};
		}
		jdbcTemplate.update(sql, args, types);
	}
	
	public List<Account> findAllAccounts(){
		String sql = "SELECT aid, customerId, accountNum, accType, balance, interestRate, "
				+ "overAmount, regDate From Account";
		
		return jdbcTemplate.query(sql, new CustomerAccountRowMapper(){
		});
	}
	
	public List<Account> findAccountsBySsn(String ssn){
		String sql = "SELECT a.aid, a.customerId, a.accountNum, a.accType, "
				+ " a.balance, a.interestRate, a.overAmount, a.regDate "
				+ " FROM Account a INNER JOIN Customer c "
				+ " ON a.customerId = c.cid "
				+ " WHERE c.ssn=?";
		return jdbcTemplate.query(sql, new CustomerAccountRowMapper(){
		}, ssn);
	}
	
	public List<Account> findAccountsByCustomerId(long customerId) {
		String sql = "SELECT a.aid, a.customerId, a.accountNum, a.accType, "
				+ " a.balance, a.interestRate, a.overAmount, a.regDate "
				+ " FROM Account a INNER JOIN Customer c "
				+ " ON a.customerId = c.cid "
				+ " WHERE a.customerId=?";
		return jdbcTemplate.query(sql, new CustomerAccountRowMapper(){
		}, customerId);
	}
}