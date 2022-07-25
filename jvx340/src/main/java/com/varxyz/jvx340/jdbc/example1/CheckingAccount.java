package com.varxyz.jvx340.jdbc.example1;


import com.varxyz.jvx340.jdbc.Account;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends Account{
	private double overdraftAmount;
}
