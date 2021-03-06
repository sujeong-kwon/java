package com.varxyz.jv200.mod010;

import java.util.Scanner;
/*
 * 소수인지 아닌지 확인 후
 * 소수가 아니면 예외 던지기
 * 합성수 ex) 6은 2x3 출력되도록 하기
 * 소수 개수
 * */
public class Prime {
	
	class PrimeException extends Exception{
		PrimeException(){
			super();
		}
		PrimeException(String msg){
			super(msg);
		}
	}
		
	public String checkPrime(int num) throws PrimeException{

		int count = 0;
		int cnt = 0;
		int count_i = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return num + " : 소수입니다.";
		}else {
			for(int i = 2; i <= num-1; i++) {
				if(num % i == 0) {
					System.out.print(i + " ");
//					for(int k = 2; k <= i; k++) {
//						
//					}
//					num /= i;
				}
//				for(int j=1; j <= i; j++) {
//					if(i % j == 0) {
//						cnt++;
//					}
//				}
//				if(cnt == 2) {
//					System.out.print(i + " ");
//				}
			}
			throw new PrimeException(num + " : 소수가 아닙니다.");
		}
	}		
}
