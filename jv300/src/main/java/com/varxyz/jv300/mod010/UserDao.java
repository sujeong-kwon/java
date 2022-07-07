package com.varxyz.jv300.mod010;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	private DataSource ds;
	
	public UserDao() {
		NamingService namingService = NamingService.getInstance();
		ds = (DataSource)namingService.getAttribute("dataSource");
	}

	public void addUser(User user) {
		String sql = "INSERT INTO User (userId, passwd, userName, ssn, email, addr) " 
				+ " VALUES (?, ?, ?, ?, ?, ?);";
		try {
			Connection con = ds.getConnection();
			PreparedStatement psmt = con.prepareStatement(sql);
			
			psmt.setString(1, user.getUserId());
			psmt.setString(2, user.getPasswd());
			psmt.setString(3, user.getUserName());
			psmt.setString(4, user.getSsn());
			psmt.setString(5, user.getEmail());
			psmt.setString(6, user.getAddr());
			psmt.executeUpdate();
			System.out.println("INSTERTED...");
			ds.close(psmt, con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public List<User> findAll(){
		String sql = "SELECT * FROM User";
		List<User> userList = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				psmt = con.prepareStatement(sql);
				rs = psmt.executeQuery();
				while(rs.next()) {
					User c = new User();
					c.setUid(rs.getLong("uid"));
					c.setUserName(rs.getString("userName"));
					userList.add(c);
				}
			}finally {
				ds.close(rs, psmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}
		
}
