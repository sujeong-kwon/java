package com.teamecho.chacha.voucher.dao;

import java.sql.*;
import com.teamecho.chacha.db.DataSource;
import com.teamecho.chacha.db.NamingService;
import com.teamecho.chacha.voucher.domain.Voucher;

public class VoucherDao {
	NamingService namingService = NamingService.getInstance();
	DataSource ds = (DataSource) namingService.getAttribute("dataSource");
	
	public VoucherDao() {
		
	}
	
	public long getVoucherId(String vType, int buyTime){
		String sql = "SELECT vid FROM Voucher WHERE vType = ? AND buyTime = ?";
		long vid = 0;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,vType);
				pstmt.setInt(2,buyTime);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					vid = rs.getLong("vid");
				}

			}finally {
				ds.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return vid;
	}

	public Voucher findVoucherByVid(long vid) {
		String sql = "SELECT * FROM Voucher WHERE vid = ?";
		Voucher voucher = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setLong(1, vid);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					voucher = new Voucher();
					voucher.setvType(rs.getString("vType"));
					voucher.setBuyTime(rs.getInt("buyTime"));
					voucher.setRegDate(rs.getTimestamp("regDate"));
				}
			}finally {
				ds.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return voucher;
	}
}
