package com.varxyz.jv250.banking;

import java.util.List;

public class Customer {
	private long cid;
	private String name; // 이름
	private String ssn; // 주민번호
	private String phone; // 연락처
	private String customerId; // 고객id
	private String passwd; // 비밀번호
	private List<Account> accountlist; // 보유계좌 List<Account> or Collection<Account>

//	public Customer(String name, String ssn, String phone, String customerId, String passwd, List<Account> accountlist) {
//		this.name = name;
//		this.ssn = ssn;
//		this.phone = phone;
//		this.customerId = customerId;
//		this.passwd = passwd;
//		this.accountlist= accountlist;	
//	}
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public List<Account> getAccountlist() {
		return accountlist;
	}

	public void setAccountlist(Account ac) {
		accountlist.add(ac);
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return  " 이름 : " + name + " 주민번호 : " + ssn + " 연락처 : " + phone; 
	}
	
}
