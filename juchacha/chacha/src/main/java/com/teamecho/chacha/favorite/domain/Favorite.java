package com.teamecho.chacha.favorite.domain;

public class Favorite {
	private long fid; //즐겨찾기 키값
	private long uid; //사용자 키값
	private long pid; //주차장 키값
	
	
	public long getFid() {
		return fid;
	}
	public void setFid(long fid) {
		this.fid = fid;
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
