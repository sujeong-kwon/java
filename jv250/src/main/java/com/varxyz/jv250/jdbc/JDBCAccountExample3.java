package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCAccountExample3 { // INSERT문
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
			
			String sql = "INSERT INTO Account(accountNum, balance, interestRate, overdraft, accountType, customerId) " + " VALUES(?, ?, ?, ?, ?, ?);";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "111-11-1111");
			stmt.setDouble(2, 3000.0);
			stmt.setDouble(3, 0.2);
			stmt.setDouble(4, 5000.0);
			stmt.setString(5, "S");
			stmt.setLong(6, 1007);
			stmt.executeUpdate();
			
			System.out.println("INSTERTED...");
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
