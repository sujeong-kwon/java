package com.varxyz.banking.mod001;

public class SavingsAccount extends Account{
	private double interestRate; // 이자율
	
	public SavingsAccount(double initBalance, double interestRate) {
		super(initBalance);
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
}


