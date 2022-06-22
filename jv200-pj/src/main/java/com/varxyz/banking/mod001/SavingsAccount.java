package com.varxyz.banking.mod001;

public class SavingsAccount extends Account{
	private double interestRate; // 이자율
	
	public String withdraw(double amount) throws InsuffientBalanceException { // 출금
		if(balance - amount < 0) {
			// 잔고 부족시 예외발생
			throw new InsuffientBalanceException("잔고가 부족합니다.");
		}
		super.balance -= amount;
		String str =  amount + "원이 출금되었습니다.\n" + "현재 잔액은 " + super.balance + "원입니다.";
		return str;
	}
}


