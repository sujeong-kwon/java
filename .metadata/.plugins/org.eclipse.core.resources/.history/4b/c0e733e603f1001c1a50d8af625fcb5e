package com.varxyz.banking.domain;

public class AccountTest {

	public static void main(String[] args) {	
		AccountService accountservice = new AccountServiceImpl();
		Account a1 = new Account("3333-1111", 1000);
		accountservice.addAccount(a1, "990000-000000");
		System.out.println(accountservice.getAccountBySsn("990000-000000"));
	}
}
