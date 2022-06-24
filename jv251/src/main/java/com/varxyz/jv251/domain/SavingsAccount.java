package com.varxyz.jv251.domain;

import java.util.Date;

import com.varxyz.jv251.exception.InsufficientBalanceException;

public class SavingsAccount extends Account{ // 일반예금계좌
	private double interestRate; // 이자율
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, 0.0);
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


