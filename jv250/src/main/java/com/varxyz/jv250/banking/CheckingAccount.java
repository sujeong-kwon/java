package com.varxyz.jv250.banking;

public class CheckingAccount extends Account{ // 당좌계좌(-계좌)
private double overdraftAmount; // 대출한도액
	
	public CheckingAccount() {
		
	}

	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}

	public void withdraw(double amount) throws OverdraftException { // 출금
		if(balance < amount) { // 잔액이 출금하려는 금액보다 적을 때
			// 잔고부족시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
			double overdraftNeeded = amount - balance; // 대출필요액(출금액 - 잔액)
			if(overdraftAmount < overdraftNeeded) { // 대출한도액보다 대출필요액이 클 때
				throw new OverdraftException("에러: 대월금 초과", balance, overdraftAmount);
			}else {
				balance = 0.0; // 잔액을 0원으로 설정; 
				overdraftAmount -= overdraftNeeded;
			}
		}else {
			balance = balance - amount;
		}
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
}
