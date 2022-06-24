package com.varxyz.jv251.dao;

import java.util.Date;
import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;

public class AccountDaoTest {

	public static void main(String[] args) {
		
		AccountDao dao = new AccountDao();
		
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("777-77-777");
		sa.setBalance(5000.0);
		sa.setCustomer(new Customer(1001));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccountType('S');
		
		// 계좌 추가
//		dao.addAccount(sa);
		
		// 주민번호로 특정 고객의 계좌 목록 조회
		for(Account account : dao.findAccountsBySsn("901213-1234567")) {
			System.out.println(account);
		}
	}
}