package com.eteam.chacha.parkinglot;

/**
 * @author 김도훈
 *
 */
public class ParkingLot {
	private String parkingCode; //주차장코드
	private String parkingName; // 주차장이름
	private String parkingAddr; // 주차장 주소
	private String parkingTel; // 주차창연락처
	private Double timeCost; // 시간당 요금
	private Double dayCost; // 종일권 요금
	private Double monthCost; // 정기권 요금
	private Double pointX; //위치좌표
	private Double pointY; //위치좌표
	
	public ParkingLot(String parkingCode, String parkingName, String parkingAddr, String parkingTel) { 
		this.parkingCode = parkingCode;
		this.parkingName = parkingName;
		this.parkingAddr = parkingAddr;
		this.parkingTel = parkingTel;
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
	public String getparkingTel() {
		return parkingTel;
	}
	public void setparkingTel(String parkingTel) {
		this.parkingTel = parkingTel;
	}
	public Double getTimeCost() {
		return timeCost;
	}
	public void setTimeCost(Double timeCost) {
		this.timeCost = timeCost;
	}
	public Double getDayCost() {
		return dayCost;
	}
	public void setDayCost(Double dayCost) {
		this.dayCost = dayCost;
	}
	public Double getMonthCost() {
		return monthCost;
	}
	public void setMonthCost(Double monthCost) {
		this.monthCost = monthCost;
	}
	public Double getPointX() {
		return pointX;
	}
	public void setPointX(Double pointX) {
		this.pointX = pointX;
	}
	public Double getPointY() {
		return pointY;
	}
	public void setPointY(Double pointY) {
		this.pointY = pointY;
	}
}
