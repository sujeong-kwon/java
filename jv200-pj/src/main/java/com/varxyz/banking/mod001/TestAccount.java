package com.varxyz.banking.mod001;

public class TestAccount {

	public static void main(String[] args) {	
		SavingsAccount s_account = new SavingsAccount(1000, 1.3);
		CheckingAccount c_account = new CheckingAccount(1000, 1000);
		
		try {
			s_account.withdraw(1000);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
		try {
			c_account.withdraw(5000);
		} catch (OverdraftException e) {
			e.printStackTrace();
		}
	}
}
