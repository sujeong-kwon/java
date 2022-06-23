package com.varxyz.jv250.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimeZone=Asia/Seoul";
	private static final String JDBC_USER = "jv250";
	private static final String JDBC_PASSWORD = "jv250";
	
	public CustomerDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("LOADED DRIVER --->" + JDBC_DRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public List<Customer> findAllCustomers(){
		String sql = "SELECT * FROM Customer";
		List<Customer> customerList = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				psmt = con.prepareStatement(sql);
				rs = psmt.executeQuery();
				while(rs.next()) {
					Customer c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setCustomerId(rs.getString("customerId"));
					customerList.add(c);
				}
			}finally {
				rs.close();
				psmt.close();
				con.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return customerList;
	}
	
	/*
	 * 주민등록번호로 고객 조회
	 * */
	public Customer findCustomerBySsn(String ssn) {
		String sql = "SELECT * FROM Customer WHERE ssn = ?";
		Customer c = null;
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				psmt = con.prepareStatement(sql);
				psmt.setString(1, ssn);
				rs = psmt.executeQuery();
				if(rs.next()) {
					c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setCustomerId(rs.getString("customerId"));
				}else {
					
				}
			}finally {
				rs.close();
				psmt.close();
				con.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer(name, ssn, phone, customerId, passwd) " 
				+ " VALUES (?, ?, ?, ?, ?);";	
		try {
			Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, customer.getName());
			psmt.setString(2, customer.getSsn());
			psmt.setString(3, customer.getPhone());
			psmt.setString(4, customer.getCustomerId());
			psmt.setString(5, customer.getPasswd());
			psmt.executeUpdate();
			System.out.println("INSTERTED...");
			psmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
