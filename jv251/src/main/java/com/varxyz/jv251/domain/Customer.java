package com.varxyz.jv251.domain;

import java.util.List;

public class Customer {
	private long cid;
	private String name; // 이름
	private String ssn; // 주민번호
	private String phone; // 연락처
	private String userId; // 고객id(온라인상에서 접근 했을 시 필요)
	private String passwd; // 비밀번호
	private List<Account> accountlist; // 보유계좌 List<Account> or Collection<Account>

	public Customer() {
		
	}
	
	public Customer(long cid) {
		this.cid = cid;
	}
	
	public Customer(String name, String ssn, String phone) {
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}
	
	/**
	 * @return the cid
	 */
	public long getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(long cid) {
		this.cid = cid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the passwd
	 */
	public String getPasswd() {
		return passwd;
	}

	/**
	 * @param passwd the passwd to set
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	/**
	 * @return the accountlist
	 */
	public List<Account> getAccountlist() {
		return accountlist;
	}

	/**
	 * @param accountlist the accountlist to set
	 */
	public void setAccountlist(List<Account> accountlist) {
		this.accountlist = accountlist;
	}

	
	@Override
	public String toString() {
		return  " 이름 : " + name + " 주민번호 : " + ssn + " 연락처 : " + phone; 
	}
	
}
