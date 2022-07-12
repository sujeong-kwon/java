package com.eteam.chacha.user.domain;

public class User {
	private long uid;
	private String userId;
	private String passwd;
	private String userName;
	private String ssn;
	private String email;
	private String addr;
	
	public User() {
		
	}
	
	public User(String userId, String passwd, String userName, String ssn, String email, String addr, Long uid) {
		this.userId = userId;
		this.passwd = passwd;
		this.userName = userName;
		this.ssn = ssn;
		this.email = email;
		this.addr = addr;
		this.uid = uid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}
	
}
