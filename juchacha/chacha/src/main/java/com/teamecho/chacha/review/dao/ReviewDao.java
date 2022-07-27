package com.teamecho.chacha.review.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.teamecho.chacha.db.DataSource;
import com.teamecho.chacha.db.NamingService;
import com.teamecho.chacha.parking.domain.ParkingLot;
import com.teamecho.chacha.review.domain.Review;
import com.teamecho.chacha.user.domain.User;
import com.teamecho.chacha.user.servlet.LoginServlet;

public class ReviewDao {
	
	private DataSource ds;
	
	public ReviewDao() {
		NamingService namingService = NamingService.getInstance();
		ds = (DataSource)namingService.getAttribute("dataSource");	
	}
	
	public void addReview(Review review) {
		String sql = "INSERT INTO Review (uid, pid, content, star_rating)" 
				+ " VALUES (?, ?, ?, ?);";
		try {
			Connection con = ds.getConnection();
			PreparedStatement psmt = con.prepareStatement(sql);			
			psmt.setLong(1, review.getUid());
			psmt.setLong(2, review.getPid());
			psmt.setString(3, review.getContent());
			psmt.setInt(4, review.getStar_rating());
			psmt.executeUpdate();
			System.out.println("INSTERTED...");
			ds.close(psmt, con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Review> findAll(Long pId){
		String sql = "SELECT r.pid, r.content, r.star_rating, r.regDate, u.userId FROM Review r INNER JOIN UserInfo u ON r.uid = u.uid WHERE r.pid = ?";

		List<Review> reviewList = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				psmt = con.prepareStatement(sql);
				psmt.setLong(1, pId);
				rs = psmt.executeQuery();
				while(rs.next()) {
					Review review = new Review();
					review.setParkingLot(new ParkingLot(rs.getLong("pid")));
					review.setContent(rs.getString("content"));
					review.setStar_rating(rs.getInt("star_rating"));
					review.setRegDate(rs.getDate("regDate"));
					review.setUser(new User(rs.getString("userId")));
					reviewList.add(review);	
				}
			}finally {
				ds.close(rs, psmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return reviewList;
	}
}
