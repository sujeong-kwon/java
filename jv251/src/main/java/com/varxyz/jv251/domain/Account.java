package com.varxyz.jv251.domain;

import java.util.Date;
import java.sql.Timestamp;

public abstract class Account {
	protected long aid;
	protected String accountNum; // 계좌번호
	protected double balance; // 잔액
	protected Customer customer;
	protected Date regDate;
	protected char accountType;
	
	public Account() {
		
	}
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public void deposit(double amount) { // 입금
		balance += amount;
	}
	
	public abstract void withdraw(double amount) throws Exception;

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}
	
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date date) {
		this.regDate = date;
	}

	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "계좌아이디 : " + aid + " 계좌번호 : " + accountNum + " 잔액 : " + balance 
				 + " " + customer  + " 날짜 : " + regDate +  " 타입 : " + accountType;
	}
}
