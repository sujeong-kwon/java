package com.varxyz.jv251.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv251.domain.Customer;

public class CustomerDao {
	
	public CustomerDao() {
	}
	
	public List<Customer> findAllCustomers(){
		String sql = "SELECT * FROM Customer";
		List<Customer> customerList = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				psmt = con.prepareStatement(sql);
				rs = psmt.executeQuery();
				while(rs.next()) {
					Customer c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userId"));
					customerList.add(c);
				}
			}finally {
				DataSourceManager.close(rs, psmt, con);
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
				con = DataSourceManager.getConnection();
				psmt = con.prepareStatement(sql);
				psmt.setString(1, ssn);
				rs = psmt.executeQuery();
				if(rs.next()) {
					c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userId"));
				}else {
					
				}
			}finally {
				DataSourceManager.close(rs, psmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer(name, ssn, phone, userId, passwd) " 
				+ " VALUES (?, ?, ?, ?, ?);";	
		try {
			Connection con = DataSourceManager.getConnection();
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, customer.getName());
			psmt.setString(2, customer.getSsn());
			psmt.setString(3, customer.getPhone());
			psmt.setString(4, customer.getUserId());
			psmt.setString(5, customer.getPasswd());
			psmt.executeUpdate();
			System.out.println("INSTERTED...");
			DataSourceManager.close(psmt, con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
