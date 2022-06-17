package com.varxyz.banking.domain;

public class TestAccount {

	public static void main(String[] args) {	
		SavingsAccount s_account = new SavingsAccount();
		CheckingAccount c_account = new CheckingAccount();
		
		try{
			System.out.println(s_account.withdraw(1000));
			System.out.println(c_account.withdraw(2000));
		}catch(InsuffientBalanceException e){
			e.printStackTrace();
		}	
	}
}
