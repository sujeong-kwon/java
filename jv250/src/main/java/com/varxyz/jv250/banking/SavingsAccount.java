package com.varxyz.jv250.banking;

import java.util.Date;

public class SavingsAccount extends Account{ // 일반예금계좌
	private static final double DEFALUT_INTEREST_RATE = 0.03;
	private double interestRate; // 이자율
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFALUT_INTEREST_RATE);
	}
	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException { // 출금
		if(balance - amount < 0) {
			// 잔고 부족시 예외발생
			throw new InsufficientBalanceException("에러: 잔고부족", balance);
		}else {
			balance -= amount;
		}
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}


