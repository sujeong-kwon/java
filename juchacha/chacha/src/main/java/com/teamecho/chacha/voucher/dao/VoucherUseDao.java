package com.teamecho.chacha.voucher.dao;

import java.sql.*;
import java.util.*;
import com.teamecho.chacha.db.DataSource;
import com.teamecho.chacha.db.NamingService;
import com.teamecho.chacha.voucher.domain.VoucherUse;
import com.teamecho.chacha.voucher.domain.VoucherUseList;

public class VoucherUseDao {
	NamingService namingService = NamingService.getInstance();
	DataSource ds = (DataSource) namingService.getAttribute("dataSource");
	
	public VoucherUseDao() {
		
	}

	public void addVoucherUse(List<VoucherUse> voucherUseList) {
		for(VoucherUse voucherUse : voucherUseList) {
			String sql = "INSERT INTO Voucher_Use(useTime, uid, vid)  VAlUES (0, ?, ?)";
			try {
				Connection con = null;
				PreparedStatement pstmt = null;
				con = ds.getConnection();
				try {
					pstmt = con.prepareStatement(sql);
					pstmt.setLong(1,voucherUse.getUid());
					pstmt.setLong(2,voucherUse.getVid());
					pstmt.executeUpdate();
				}finally {
					System.out.println("INSERTED....");
					ds.close(pstmt, con);
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<VoucherUse> findVoucherByUid(long uid) {
	      String sql = "SELECT * FROM Voucher_use WHERE uid = ?";
	      List<VoucherUse> vuList = new ArrayList<VoucherUse>();

	      try {
	         Connection con = ds.getConnection();
	         PreparedStatement psmt = con.prepareStatement(sql);
	         psmt.setLong(1, uid);
	         ResultSet rs = psmt.executeQuery();
	         while (rs.next()) {
	            VoucherUse vu = new VoucherUse();
	            vu.setVuid(rs.getLong("vuid"));
	            vu.setUseTime(rs.getInt("useTime"));
	            vu.setVuse(rs.getString("vuse"));
	            vu.setUid(rs.getLong("uid"));
	            vu.setVid(rs.getLong("vid"));
	            vuList.add(vu);
	         }
	         System.out.println("SELECTED...");
	         ds.close(rs, psmt, con);
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return vuList;
	   }
	
	public List<VoucherUseList> findVoucherUseList(long uid) {
	      String sql = "SELECT v.vtype, v.buyTime, vu.useTime, vu.vuse, vu.regDate"
	      		+ " FROM Voucher_use vu INNER JOIN Voucher v ON vu.vid = v.vid"
	      		+ " WHERE vu.uid = ?";
	      List<VoucherUseList> vuList = new ArrayList<VoucherUseList>();

	      try {
	         Connection con = ds.getConnection();
	         PreparedStatement psmt = con.prepareStatement(sql);
	         psmt.setLong(1, uid);
	         ResultSet rs = psmt.executeQuery();
	         while (rs.next()) {
				VoucherUseList vu = new VoucherUseList();
				vu.setvType(rs.getString("vtype"));
				vu.setBuyTime(rs.getInt("buyTime"));
				vu.setUseTime(rs.getInt("useTime"));
				vu.setVuse(rs.getString("vuse"));
				vu.setRegDate(rs.getTimestamp("regDate"));
				vuList.add(vu);
	         }
	         System.out.println("SELECTED...");
	         ds.close(rs, psmt, con);
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return vuList;
	   }
}
