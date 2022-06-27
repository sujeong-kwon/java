package com.varxyz.jv251.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.CheckingAccount;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;

public class AccountDao {
	
	public AccountDao() {
	}
	
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account(accountNum, balance, interestRate, overdraft, accountType, customerId) "
				+ " VALUES(?, ?, ?, ?, ?, ?);";
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			try {
				con = DataSourceManager.getConnection();
				psmt = con.prepareStatement(sql);
				psmt.setString(1, account.getAccountNum());
				psmt.setDouble(2, account.getBalance());
				
				if(account instanceof SavingsAccount) {
					SavingsAccount sa = (SavingsAccount) account;
					psmt.setDouble(3, sa.getInterestRate()); // interestRate
					psmt.setDouble(4, 0.0); // overdraft
					psmt.setString(5, String.valueOf('S')); // accountType
				} else {
					CheckingAccount ca = (CheckingAccount) account;
					psmt.setDouble(3, 0.0); // interestRate
					psmt.setDouble(4, ca.getOverdraftAmount()); // overdraft
					psmt.setString(5, String.valueOf('C')); // accountType	
				}
				psmt.setLong(6, account.getCustomer().getCid()); // customerId
				psmt.executeUpdate();
			}finally {
				DataSourceManager.close(psmt, con);
			}
			System.out.println("NEW ACCOUNT INSTERTED...");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 전달된 주민번호를 특정 고객의 계좌 목록 조회
	 * */
	public List<Account> findAccountsBySsn(String ssn){
		String sql = "SELECT a.aid, a.accountNum, a.balance, a.interestRate, " 
				+ "a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate" 
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid" 
				+ " WHERE c.ssn = ?";
		List<Account> list = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				psmt = con.prepareStatement(sql);
				psmt.setString(1, ssn);
				rs = psmt.executeQuery();
				Account account = null;
				while(rs.next()) {
					if(rs.getString("accountType").charAt(0) == 'S') {
						account = new SavingsAccount(sql, 0);
						((SavingsAccount) account).setInterestRate(rs.getDouble("interestRate"));
					}else {
						account = new CheckingAccount();
						((CheckingAccount) account).setOverdraftAmount(rs.getDouble("overdraft"));
					}
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					account.setCustomer(new Customer(rs.getString("name"),
							rs.getString("ssn"), rs.getString("phone")));
					account.setRegDate(rs.getTimestamp("regDate"));
					account.setAccountType(rs.getString("accountType").charAt(0));
					list.add(account);
				}
			}finally {
				DataSourceManager.close(rs, psmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// 계좌번호로 계좌찾기
	public Account findAccountByAccountNum(String accountNum) {
		String sql = "SELECT * FROM Account WHERE accountNum = ?";
		Account account = null;
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				psmt = con.prepareStatement(sql);
				psmt.setString(1, accountNum);
				rs = psmt.executeQuery();
				while(rs.next()) {
					if(rs.getString("accountType").charAt(0) == 'S') {
						account = new SavingsAccount();
						((SavingsAccount) account).setInterestRate(rs.getDouble("interestRate"));
					}else {
						account = new CheckingAccount();
						((CheckingAccount) account).setOverdraftAmount(rs.getDouble("overdraft"));
					}
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					account.setRegDate(rs.getTimestamp("regDate"));
					account.setAccountType(rs.getString("accountType").charAt(0));
				}
			}finally {
				DataSourceManager.close(rs, psmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return account;
	}
	
	public void updateBalance(String accountNum, double balance) {
		String sql = "UPDATE ACCOUNT SET balance = " + balance + " WHERE accountNum = ?";
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			try {
				con = DataSourceManager.getConnection();
				psmt = con.prepareStatement(sql);
				psmt.setString(1, accountNum);
				psmt.executeUpdate();
			}finally {
				DataSourceManager.close(psmt, con);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
