package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample3 { // INSERT문
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
			
			String sql = "INSERT INTO Customer(name, ssn, phone, customerId, passwd) " + " VALUES (?, ?, ?, ?, ?);";
			PreparedStatement stmt = con.prepareStatement(sql); // 속도 더 빠름
			stmt.setString(1, "조조");
			stmt.setString(2, "901213-1234567");
			stmt.setString(3, "010-1212-3434");
			stmt.setString(4, "jsp");
			stmt.setString(5, "1234");
			stmt.executeUpdate();
			
			System.out.println("INSTERTED...");
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
