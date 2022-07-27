package com.teamecho.chacha.voucher.domain;

public class VoucherUse {
	private long vuid;
	private int useTime;
	private String vuse;
	private long uid;
	private long vid;
	private long rid;
	
	public VoucherUse() {
		
	}

	public VoucherUse(int useTime, long uid, long vid) {
		this.useTime = useTime;
		this.uid = uid;
		this.vid = vid;		
	}
	
	public long getVuid() {
		return vuid;
	}
	public void setVuid(long vuid) {
		this.vuid = vuid;
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
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	public long getVid() {
		return vid;
	}
	public void setVid(long vid) {
		this.vid = vid;
	}
}
