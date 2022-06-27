package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.exception.CustomerNotFoundException;
import com.varxyz.jv251.exception.DuplicatedEntityException;

public class BankServiceTest {
	public static void main(String[] args){
		BankService service = BankService.getInstance();
		// 화면 부분
		String name = "동탁";
		String ssn = "890123-1234567";
		String phone = "010-4343-3232";
		String userId = "framework";
		String passwd = "1111";
		// 1. 신규 고객 등록
//		service.addCustomer(name, ssn, phone, userId, passwd);
//		try {
//			// 2. SavingAccount 생성
//			service.addSavingAccount(7000.0, 0.4, ssn);
//		} catch (CustomerNotFoundException e) {
//			e.printStackTrace();
//		}
		// 3. 고객 등록 확인
//		Customer customer = service.getCustomerBySsn(ssn);
//		System.out.println(customer);
		
		// 4. 고객 계좌 등록 확인
//		List<Account> myList = service.getAccountBySsn(ssn);
//		for(Account account : myList) {
//			System.out.println(account);
//		}
		
		service.setDeposit("111-11-1111", 1000.0);
		
//		System.out.println();
	}
}
