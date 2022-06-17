package com.varxyz.jv200.mod010;

import java.util.Scanner;

import com.varxyz.jv200.mod010.Prime.PrimeException;

public class PrimeTest {

	public static void main(String[] args){
		Prime prime = new Prime();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		try{
			System.out.println(prime.checkPrime(num));
		}catch(PrimeException e){
			e.printStackTrace();
		}		
	}
}
