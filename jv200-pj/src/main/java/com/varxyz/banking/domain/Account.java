package com.varxyz.banking.domain;

import com.varxyz.banking.domain.customer.Customer;

public class Account {
	protected String accountNum; // 계좌번호
	protected double balance = 1000; // 잔액
	protected Customer customer;
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public void deposit(double amount) { // 입금
		balance += amount;
	}

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
}
