package com.varxyz.banking.mod001;

public class Account {
	protected String accountNum; // 계좌번호
	protected double balance = 1000; // 잔액
	
	public void deposit(double amount) { // 입금
		balance += amount;
	}
}
