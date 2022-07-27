package com.teamecho.chacha.voucher.domain;

import java.sql.Timestamp;

public class Voucher {
	private long vid;
	private String vType;
	private int buyTime;
	private Timestamp regDate;
	
	public Voucher() {
		
	}
	public Voucher(String vType, long buyTime) {
		
	}
	public long getVid() {
		return vid;
	}
	public void setVid(long vid) {
		this.vid = vid;
	}
	
	public String getvType() {
		return vType;
	}
	public void setvType(String vType) {
		this.vType = vType;
	}
	public int getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(int buyTime) {
		this.buyTime = buyTime;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
}
