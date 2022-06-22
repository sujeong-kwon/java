package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCAccountExample4 { // UPDATE문
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
			
			String sql = "UPDATE Account SET accountNum=?, balance=? WHERE aid=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "333-33-3333");
			stmt.setDouble(2, 4000.0);
			stmt.setLong(3, 3003);
			stmt.executeUpdate();
			
			System.out.println("UPDATED...");
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
