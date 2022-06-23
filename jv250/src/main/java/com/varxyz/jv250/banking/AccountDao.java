package com.varxyz.jv250.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimeZone=Asia/Seoul";
	private static final String JDBC_USER = "jv250";
	private static final String JDBC_PASSWORD = "jv250";
	
	public AccountDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("LOADED DRIVER --->" + JDBC_DRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account(accountNum, balance, interestRate, overdraft, accountType, customerId) "
				+ " VALUES(?, ?, ?, ?, ?, ?);";
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
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
				psmt.close();
				con.close();
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
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
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
//					account.setAccountType(rs.("accountType"));
					list.add(account);
				}
			}finally {
				rs.close();
				psmt.close();
				con.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
