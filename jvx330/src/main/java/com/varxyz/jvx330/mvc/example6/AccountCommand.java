package com.varxyz.jvx330.mvc.example6;

import com.varxyz.jvx330.mvc.example4.CustomerCommand;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCommand {
	private CustomerCommand customer;
	private String accountNum;
	private char accType;
	private double balance;
}
