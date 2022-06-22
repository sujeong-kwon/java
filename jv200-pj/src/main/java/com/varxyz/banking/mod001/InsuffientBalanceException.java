package com.varxyz.banking.mod001;

public class InsuffientBalanceException extends RuntimeException{
	public InsuffientBalanceException(String msg) {
		super(msg);
	}
}
