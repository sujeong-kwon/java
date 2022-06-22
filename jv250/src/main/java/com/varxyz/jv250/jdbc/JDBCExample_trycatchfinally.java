package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample_trycatchfinally { // SELECT문
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimeZone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER --->" + driver);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		String sql = "SELECT * FROM Customer WHERE name='유비'";
		try {
			Connection con = DriverManager.getConnection(url, id, passwd);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); // 결과를 rs가 가지고 있음
			
			System.out.println("CONNECTED TO --->" + url);
			while(rs.next()) {
				long cid = rs.getLong("cid");
				String customerId = rs.getString("customerId");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				System.out.println(cid);
				System.out.println(customerId);
				System.out.println(name);
				System.out.println(phone);
				System.out.println("--------------------------");
			}
			rs.close();
			stmt.close();
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
