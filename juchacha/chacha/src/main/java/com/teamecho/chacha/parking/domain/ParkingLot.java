package com.teamecho.chacha.parking.domain;

public class ParkingLot {
	private Long pid;
	private String parkingCode;
	private String parkingName;
	private String parkingAddr;
	private String parkingTel;
	private double timeCost;
	private double dayCost;
	private double monthCost;
	private int parkingSpace;
	private double pointX;
	private double pointY;
	
	public ParkingLot() {
		
	}
	
	public ParkingLot(Long pid) {
		this.pid = pid;
	}
	
	public ParkingLot(String parkingCode, String parkingName, String parkingAddr, String parkingTel, double timeCost,
			double dayCost, double monthCost, int parkingSpace, double pointX, double pointY) {
		this.parkingCode = parkingCode;
		this.parkingName = parkingName;
		this.parkingAddr = parkingAddr;
		this.parkingTel = parkingTel;
		this.timeCost = timeCost;
		this.dayCost = dayCost;
		this.monthCost = monthCost;
		this.parkingSpace = parkingSpace;
		this.pointX = pointX;
		this.pointY = pointY;
	}

	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getParkingCode() {
		return parkingCode;
	}
	public void setParkingCode(String parkingCode) {
		this.parkingCode = parkingCode;
	}
	public String getParkingName() {
		return parkingName;
	}
	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}
	public String getParkingAddr() {
		return parkingAddr;
	}
	public void setParkingAddr(String parkingAddr) {
		this.parkingAddr = parkingAddr;
	}
	public String getParkingTel() {
		return parkingTel;
	}
	public void setParkingTel(String parkingTel) {
		this.parkingTel = parkingTel;
	}
	public double getTimeCost() {
		return timeCost;
	}
	public void setTimeCost(double timeCost) {
		this.timeCost = timeCost;
	}
	public double getDayCost() {
		return dayCost;
	}
	public void setDayCost(double dayCost) {
		this.dayCost = dayCost;
	}
	public double getMonthCost() {
		return monthCost;
	}
	public void setMonthCost(double monthCost) {
		this.monthCost = monthCost;
	}
	public int getParkingSpace() {
		return parkingSpace;
	}
	public void setParkingSpace(int parkingSpace) {
		this.parkingSpace = parkingSpace;
	}
	public double getPointX() {
		return pointX;
	}
	public void setPointX(double pointX) {
		this.pointX = pointX;
	}
	public double getPointY() {
		return pointY;
	}
	public void setPointY(double pointY) {
		this.pointY = pointY;
	}

}
