package com.varxyz.banking.domain;

public class CheckingAccount extends Account{ // 당좌계좌(-계좌)
	private double overdraftAmount = 2000; // 대출한도액
	private double plusAmount; // 잔액 + 대출한도액
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public String withdraw(double amount) throws InsuffientBalanceException { // 출금
		if(balance < amount) {
			// 잔고부족시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
			plusAmount = overdraftAmount + balance;
			balance = plusAmount;
			balance = balance - amount;
			String str = overdraftAmount + "원이 대출되었습니다.\n" + amount + "원이 출금되었습니다.\n" + "현재 잔액은 " + balance + "원입니다.";		
			if(overdraftAmount < amount) {
				throw new InsuffientBalanceException("잔고가 부족합니다.");
			}
			return str;
		}else {
			balance = balance - amount;
			String str =  amount + "원이 출금되었습니다.\n" + "현재 잔액은 " + balance + "원입니다.";
			return str;
		}
	}
}
