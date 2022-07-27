package com.teamecho.chacha.parking.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.teamecho.chacha.db.*;
import com.teamecho.chacha.parking.domain.ParkingLot;

public class ParkingLotDao {
	NamingService namingService = NamingService.getInstance();
	DataSource ds = (DataSource) namingService.getAttribute("dataSource");
	
	public ParkingLotDao() {
		
	}
	/**
	 * 모든 주차장 정보 객체를 찾는 함수
	 * @작성자 : 박동근
	 * @return
	 */
	public List<ParkingLot> findAllParkingLot(){	
		String sql = "SELECT * FROM parkingLot";
		List<ParkingLot> parkingdotList = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					ParkingLot p = new ParkingLot();
					p.setPid(rs.getLong("pid"));
					p.setParkingCode(rs.getString("parkingCode"));
					p.setParkingName(rs.getString("parkingName"));
					p.setParkingAddr(rs.getString("parkingAddr"));
					p.setParkingTel(rs.getString("parkingTel"));
					p.setTimeCost(rs.getDouble("timeCost"));
					p.setDayCost(rs.getDouble("dayCost"));
					p.setMonthCost(rs.getDouble("monthCost"));
					p.setParkingSpace(rs.getInt("parkingSpace"));
					p.setPointX(rs.getDouble("pointX"));
					p.setPointY(rs.getDouble("pointY"));
					
					parkingdotList.add(p);
				}
			}finally {
				ds.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return parkingdotList;
	}
	/**
	 * 주차장 좌표값으로 주차장 객체 가져오기
	 * @작성자 : 박동근
	 * @return
	 */
	public ParkingLot findParkingLotByPoint(double pointX, double pointY){	
		String sql = "SELECT * FROM parkingLot WHERE pointx =? AND pointy =?";
		ParkingLot parkingLot = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setDouble(1,pointX);
				pstmt.setDouble(2,pointY);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					parkingLot = new ParkingLot();
					parkingLot.setPid(rs.getLong("pid"));
					parkingLot.setParkingCode(rs.getString("parkingCode"));
					parkingLot.setParkingName(rs.getString("parkingName"));
					parkingLot.setParkingAddr(rs.getString("parkingAddr"));
					parkingLot.setParkingTel(rs.getString("parkingTel"));
					parkingLot.setTimeCost(rs.getDouble("timeCost"));
					parkingLot.setDayCost(rs.getDouble("dayCost"));
					parkingLot.setMonthCost(rs.getDouble("monthCost"));
					parkingLot.setParkingSpace(rs.getInt("parkingSpace"));
					parkingLot.setPointX(rs.getDouble("pointX"));
					parkingLot.setPointY(rs.getDouble("pointY"));
				}
			}finally {
				ds.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return parkingLot;
	}
	/**
	 * 주차장 코드로 주차장 객체 가져오기
	 * @작성자 : 박동근
	 * @return
	 */
	public ParkingLot findParkingLotByCode(String parkingcode){	
		String sql = "SELECT * FROM parkingLot WHERE parkingCode =?";
		ParkingLot parkingLot = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,parkingcode);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					parkingLot = new ParkingLot();
					parkingLot.setPid(rs.getLong("pid"));
					parkingLot.setParkingCode(rs.getString("parkingCode"));
					parkingLot.setParkingName(rs.getString("parkingName"));
					parkingLot.setParkingAddr(rs.getString("parkingAddr"));
					parkingLot.setParkingTel(rs.getString("parkingTel"));
					parkingLot.setTimeCost(rs.getDouble("timeCost"));
					parkingLot.setDayCost(rs.getDouble("dayCost"));
					parkingLot.setMonthCost(rs.getDouble("monthCost"));
					parkingLot.setParkingSpace(rs.getInt("parkingSpace"));
					parkingLot.setPointX(rs.getDouble("pointX"));
					parkingLot.setPointY(rs.getDouble("pointY"));
				}
			}finally {
				ds.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return parkingLot;
	}
	
	/**
	 * 주차장 코드로 주차장 객체 가져오기
	 * @작성자 : 박동근
	 * @return
	 */
	public ParkingLot findParkingLotByPid(Long pid){	
		String sql = "SELECT * FROM parkingLot WHERE pid =?";
		ParkingLot parkingLot = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setLong(1,pid);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					parkingLot = new ParkingLot();
					parkingLot.setPid(rs.getLong("pid"));
					parkingLot.setParkingCode(rs.getString("parkingCode"));
					parkingLot.setParkingName(rs.getString("parkingName"));
					parkingLot.setParkingAddr(rs.getString("parkingAddr"));
					parkingLot.setParkingTel(rs.getString("parkingTel"));
					parkingLot.setTimeCost(rs.getDouble("timeCost"));
					parkingLot.setDayCost(rs.getDouble("dayCost"));
					parkingLot.setMonthCost(rs.getDouble("monthCost"));
					parkingLot.setParkingSpace(rs.getInt("parkingSpace"));
					parkingLot.setPointX(rs.getDouble("pointX"));
					parkingLot.setPointY(rs.getDouble("pointY"));
				}
			}finally {
				ds.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return parkingLot;
	}
	
	/**
	 * 주차장 코드를 받아서 현재 주차중인 차량 수롤 보여주기 위한 메소드
	 * @param pointX
	 * @param pointY
	 * @return
	 */
	public int getParkingLotSpaces (double pointX, double pointY){	
		String sql = "SELECT pu.useSpaces FROM ParkingLot p  INNER JOIN Parkinglot_Use pu ON p.pid = pu.pid WHERE p.pointX = ? AND p.pointY = ?";
		int space = 0;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setDouble(1,pointX);
				pstmt.setDouble(2,pointY);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					space = rs.getInt("useSpaces");
				}
			}finally {
				ds.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return space;
	}
	
	/**
	 * 키워드로 주차장 목록 가져오기
	 * @작성자 : 박동근
	 * @return
	 */
	public List<ParkingLot> findSearchParkingLot(String str){	
		String sql = "SELECT p.pid, p.parkingCode, p.parkingName, p.parkingAddr, p.parkingTel, p.timeCost, p.dayCost, p.monthCost, p.parkingSpace, p.pointX, p.pointY "
				   + "FROM parkingLot p INNER JOIN parking_keyword pk ON p.pid = pk.pid "
    			   + "WHERE pk.keyword like '%"+ str +"%' "
				   + "GROUP BY p.pid";
		List<ParkingLot> parkingdotList = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					ParkingLot p = new ParkingLot();
					p.setPid(rs.getLong("pid"));
					p.setParkingCode(rs.getString("parkingCode"));
					p.setParkingName(rs.getString("parkingName"));
					p.setParkingAddr(rs.getString("parkingAddr"));
					p.setParkingTel(rs.getString("parkingTel"));
					p.setTimeCost(rs.getDouble("timeCost"));
					p.setDayCost(rs.getDouble("dayCost"));
					p.setMonthCost(rs.getDouble("monthCost"));
					p.setParkingSpace(rs.getInt("parkingSpace"));
					p.setPointX(rs.getDouble("pointX"));
					p.setPointY(rs.getDouble("pointY"));
					
					parkingdotList.add(p);
				}
			}finally {
				ds.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return parkingdotList;
	}
}
