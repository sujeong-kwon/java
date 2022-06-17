package com.varxyz.banking.domain;

public class Account {
	protected String accountNum; // 계좌번호
	protected double balance = 1000; // 잔액
	
	public void deposit(double amount) { // 입금
		balance += amount;
	}
}
