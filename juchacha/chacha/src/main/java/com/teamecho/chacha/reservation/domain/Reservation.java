package com.teamecho.chacha.reservation.domain;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 예약 클래스
 * @author 김나혜
 *
 */
public class Reservation {
	private long rid;
	private Timestamp start_time;
	private Timestamp end_time;
	private int cost;
	private String voucher_use;
	private long uid;
	private long pid;

	public Reservation() {
		
	}

	public long getRid() {
		return rid;
	}

	public void setRid(long rid) {
		this.rid = rid;
	}

	public Timestamp getStart_time() {
		return start_time;
	}

	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}

	public Timestamp getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getVoucher_use() {
		return voucher_use;
	}

	public void setVoucher_use(String voucher_use) {
		this.voucher_use = voucher_use;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}
	
}
