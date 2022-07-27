package com.teamecho.chacha.favorite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.teamecho.chacha.db.DataSource;
import com.teamecho.chacha.db.NamingService;
import com.teamecho.chacha.favorite.domain.Favorite;

public class FavoriteDao {
	private DataSource ds;

	public FavoriteDao() {
		NamingService namingService = NamingService.getInstance();
		ds = (DataSource) namingService.getAttribute("dataSource");
	}

	public void addFavo(Long pid, Long uid) {
		String sql = "INSERT INTO Favorite(uid, pid) VALUES (?, ?);";
		try {
			Connection con = ds.getConnection();
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setLong(1, uid);
			psmt.setLong(2, pid);
			psmt.executeUpdate();
			System.out.println("INSTERTED...");
			ds.close(psmt, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Favorite> findFavo(Long uid) {
		String sql = "SELECT * FROM Favorite WHERE uid = ?";
		List<Favorite> fvList = new ArrayList<Favorite>();

		try {
			Connection con = ds.getConnection();
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setLong(1, uid);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Favorite fv = new Favorite();
				fv.setUid(rs.getLong("uid"));
				fv.setPid(rs.getLong("pid"));
				fvList.add(fv);
			}
			System.out.println("SELECTED...");
			ds.close(rs, psmt, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fvList;
	}

	public void deleFavo(Long pid, Long uid) {
		String sql = "DELETE FROM Favorite WHERE pid = ? AND uid =?";

		try {
			Connection con = ds.getConnection();
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setLong(1, pid);
			psmt.setLong(2, uid);
			psmt.executeUpdate();
			System.out.println("DELETE...");
			ds.close(psmt, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isValidFavorite(Long pid, Long uid) {
		String sql = "SELECT * FROM Favorite WHERE pid = ? AND uid =?";
		int i = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement psmt = con.prepareStatement(sql);
			ResultSet rs = null;
			
			psmt.setLong(1, pid);
			psmt.setLong(2, uid);
			psmt.executeQuery();
			rs = psmt.executeQuery();
			if(rs.next()) {
				i++;
			}
			ds.close(psmt, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}else {
			return false;
		}

	}
}
