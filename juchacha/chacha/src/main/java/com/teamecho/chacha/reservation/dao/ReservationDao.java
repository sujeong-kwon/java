package com.teamecho.chacha.reservation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.teamecho.chacha.db.DataSource;
import com.teamecho.chacha.db.NamingService;
import com.teamecho.chacha.reservation.domain.Reservation;

public class ReservationDao {
	NamingService namingService = NamingService.getInstance();
	DataSource ds = (DataSource) namingService.getAttribute("dataSource");
	
	public void addReservation(Reservation rez) {
		String sql = "INSERT INTO reservation (start_time, end_time, cost, voucher_use, uid, pid)" + 
					" VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				
				pstmt.setTimestamp(1, rez.getStart_time());
				pstmt.setTimestamp(2, rez.getEnd_time());
				pstmt.setInt(3, rez.getCost());
				pstmt.setString(4, rez.getVoucher_use());
				pstmt.setLong(5, rez.getUid());
				pstmt.setLong(6, rez.getPid());
				
				pstmt.executeUpdate();
			} finally {
				ds.close(pstmt, con);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public List<Reservation> findReservationListByUid(long uid) {
		String sql = "SELECT * FROM reservation WHERE uid = ?";
		List<Reservation> rList = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setLong(1, uid);
				rs = pstmt.executeQuery();
				Reservation rez = null;
				while(rs.next()) {
					rez = new Reservation();
					rez.setStart_time(rs.getTimestamp("start_time"));
					rez.setEnd_time(rs.getTimestamp("end_time"));
					rez.setCost(rs.getInt("cost"));
					rez.setVoucher_use(rs.getString("voucher_use"));
					rez.setUid(rs.getLong("uid"));
					rez.setPid(rs.getLong("pid"));
					rList.add(rez);
				}
			}finally {
				ds.close(rs, pstmt, con);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rList;
	}
	
	
}
