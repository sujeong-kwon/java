package com.teamecho.chacha.review.domain;

import java.sql.Date;

import com.teamecho.chacha.parking.domain.ParkingLot;
import com.teamecho.chacha.user.domain.User;

public class Review {
	private long rvid;
	private long pid;
	private long uid;
	private User user;
	private ParkingLot parkingLot;
	private String content;
	private int star_rating;
	private Date regDate;

	public Review() {
		
	}

	public Review(long rvid, User user, ParkingLot parkingLot, String content, int star_rating) {
		this.rvid = rvid;
		this.user = user;
		this.parkingLot = parkingLot;
		this.content = content;
		this.star_rating = star_rating;
	}

	public long getRvid() {
		return rvid;
	}

	public void setRvid(long rvid) {
		this.rvid = rvid;
	}
	
	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStar_rating() {
		return star_rating;
	}

	public void setStar_rating(int star_rating) {
		this.star_rating = star_rating;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
