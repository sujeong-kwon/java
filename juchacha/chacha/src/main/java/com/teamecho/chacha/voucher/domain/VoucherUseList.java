package com.teamecho.chacha.voucher.domain;

import java.sql.Timestamp;

public class VoucherUseList {
	private String vType;
	private int buyTime;
	private int useTime;
	private String vuse;
	private Timestamp regDate;
	
	public VoucherUseList() {
		
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

	public int getUseTime() {
		return useTime;
	}

	public void setUseTime(int useTime) {
		this.useTime = useTime;
	}

	public String getVuse() {
		return vuse;
	}

	public void setVuse(String vuse) {
		this.vuse = vuse;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
}
