package com.varxyz.jv250.jdbc.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountJdbcTest {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimeZone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER --->" + driver);
			
			Connection con = DriverManager.getConnection(url, id, passwd);
			System.out.println("CONNECTED TO --->" + url);
			
			select(con);
			insert(con);
			select(con);
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void select(Connection con) {
		String sql = "SELECT * FROM Account";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				long aid = rs.getLong("aid");
				String accountNum = rs.getString("accountNum");
				double balance = rs.getDouble("balance");
				double interestRate = rs.getDouble("interestRate");
				double overdraft = rs.getDouble("overdraft");
				char accountType = rs.getString("accountType").charAt(0);
				System.out.println(aid);
				System.out.println(accountNum);
				System.out.println(balance);
				System.out.println(interestRate);
				System.out.println(overdraft);
				System.out.println(accountType);
				System.out.println("--------------------------");
			}
			pstmt.close();
			System.out.println("SELECT COMPLETED....\n");
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void insert(Connection con) {
		String sql = "INSERT INTO Account(accountNum, balance, interestRate, overdraft, accountType, customerId) " + " VALUES(?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "666-66-6666");
			pstmt.setDouble(2, 3000.0);
			pstmt.setDouble(3, 0.2);
			pstmt.setDouble(4, 5000.0);
			pstmt.setString(5, String.valueOf('S'));
			pstmt.setLong(6, 1002);
			
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println("NEW ACCOUNT INSTERTED...\n");
			
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
