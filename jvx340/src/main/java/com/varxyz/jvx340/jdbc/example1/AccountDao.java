package com.varxyz.jvx340.jdbc.example1;


import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.varxyz.jvx340.jdbc.Account;

@Component("accountDao")
public class AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	public AccountDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account (customerId, accountNum, accType, balance, interestRate, overAmount)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		SavingsAccount sa = null;
		CheckingAccount ca = null;
		Object[] args = null;
		
		jdbcTemplate.update(sql, account.getCustomer().getCid(),
				account.getAccountNum(), account.getAccType(), 
				account.getBalance()
				);
	}
}
