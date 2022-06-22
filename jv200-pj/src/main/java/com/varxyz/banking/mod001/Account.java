package com.varxyz.banking.mod001;
/**
 * 계좌정보를 캡슐화
 * @author Administrator
 *
 */
public abstract class Account {
	protected String accountNum; // 계좌번호
	protected double balance; // 잔액
	
	public Account(double initBalance) {
		balance = initBalance;
	}
	
	/**
	 * 현재의 잔고를 리턴한다
	 * @return 현재 잔고
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * 전달된 amt를 현재잔고에 적립한다.
	 * @param amt 입금액
	 */
	public void deposit(double amount) { // 입금
		balance += amount;
	}
	
	public abstract void withdraw(double amount) throws Exception; // 출금
}