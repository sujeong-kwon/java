package com.varxyz.banking.domain;

public class AccountTest {

	public static void main(String[] args) {	
		AccountService accountservice = AccountServiceImpl.getInstance();
		accountservice.createSavingAccount("3333-1111", 1000.0, 1.3);
//		accountservice.addAccount(a1);
		System.out.println(accountservice.getAccountByAccountNum("3333-1111"));
	}
}
