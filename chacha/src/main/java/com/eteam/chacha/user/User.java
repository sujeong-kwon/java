package com.eteam.chacha.user;

/**
 * @author 김도훈
 *
 */
public class User {
	private Long uid; // DB PK
	private String userId; //사용자 아이디
	private String passwd; // 사용자 비밀번호
	private String userName; // 사용자 이름
	private String userPhone; // 사용자 연락처
	private String addr; //사용자 주소
	private String licenseNumber; //사용자 차량번호
	private String usertype; //사용자 가입유형(가입 탈퇴 확인용)
	
	public User(String userId, String passwd, String userName, String userPhone, String addr, String licenseNumber, String usertype) {
		this.userId = userId;
		this.passwd = passwd;
		this.userName = userName;
		this.userPhone = userPhone;
		this.addr = addr;
		this.licenseNumber = licenseNumber;
		this.usertype = usertype;
	}
	
	
	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
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
	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
}
