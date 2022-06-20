package com.varxyz.banking.domain;

import java.util.ArrayList;
import java.util.List;

import com.varxyz.banking.service.CustomerService;
import com.varxyz.banking.service.CustomerServiceImpl;

public class AccountServiceImpl implements AccountService{
	private List<Account> accountList = new ArrayList<Account>();
	private CustomerService customerService;
	
	public AccountServiceImpl() {
		customerService = new CustomerServiceImpl();
	}
	
	public Account createSavingAccount(String accountNum, double balance, double interestRate) {
		return new SavingsAccount(accountNum, balance, interestRate);
	}
	
	public Account createCheckingAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public void addAccount(Account account, String ssn) { // 생각해보기
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	public List<Account> getAccountBySsn(String ssn){ // 주민번호로 계좌번호 조회
		Customer customer = customerService.getCustomerBySsn(ssn); // 파라미터로 받은 주민번호를 가진 customer 검색 c 객체 리턴
		if(customer != null) { // null이 아니면
			return customer.getAccountlist(); // 해당 객체의 accountlist를 리턴한다.
		}
		return null;
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		for(Account a : accountList) {
			if(accountNum.equals(a.getAccountNum())) {
				return a;
			}
		}
		return null;
	}	
}
