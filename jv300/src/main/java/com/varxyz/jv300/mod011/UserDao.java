package com.varxyz.jv300.mod011;

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
		String sql = "INSERT INTO User (userId, passwd, userName, ssn, email, addr)" 
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
					User user = new User();
					user.setUserName(rs.getString("userName"));
					user.setUserId(rs.getString("userId"));
					user.setEmail(rs.getString("email"));
					user.setAddr(rs.getString("addr"));
					user.setUid(rs.getLong("uid"));
					userList.add(user);
				}
			}finally {
				ds.close(rs, psmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}
	

	public User findUser(Long uId) {
		String sql = "SELECT * FROM User WHERE uid = ?";
		User user = new User();
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				psmt = con.prepareStatement(sql);
				psmt.setLong(1, uId);
				rs = psmt.executeQuery();
				while(rs.next()) {
				user.setUid(rs.getLong("uid"));
				user.setUserId(rs.getString("userId"));
				user.setPasswd(rs.getString("passwd"));
				user.setUserName(rs.getString("userName"));
				user.setSsn(rs.getString("ssn"));
				user.setEmail(rs.getString("email"));
				user.setAddr(rs.getString("addr"));
				}
			}finally {
				ds.close(rs, psmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public boolean findUserByIdPw(String userId, String passwd) {
		String sql = "SELECT * FROM User WHERE userId = ? AND passwd = ?";
		int i = 0;
			try {
				ResultSet rs = null;
				Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				pstmt.setString(2, passwd);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					i++;
				}
				
				ds.close(pstmt, con);
			}catch(SQLException e) {
			e.printStackTrace();
		}
		if(i > 0) {
			return true;
		}else {
			return false;
		}
	}

	public void updateUser(User user) {
		String sql = "UPDATE User SET userId = ?, passwd = ?, userName = ?, ssn = ?, email = ?, addr = ? WHERE uid = ?";
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			try {
				con = ds.getConnection();
				psmt = con.prepareStatement(sql);
				psmt.setString(1, user.getUserId());
				psmt.setString(2, user.getPasswd());
				psmt.setString(3, user.getUserName());
				psmt.setString(4, user.getSsn());
				psmt.setString(5, user.getEmail());
				psmt.setString(6, user.getAddr());
				psmt.setLong(7, user.getUid());
				psmt.executeUpdate();
				System.out.println("UPDATED...");
			}finally {
				ds.close(psmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
