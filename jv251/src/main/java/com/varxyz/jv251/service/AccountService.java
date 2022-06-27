package com.varxyz.jv251.service;

import java.util.List;
import java.util.Random;

import com.varxyz.jv251.dao.AccountDao;
import com.varxyz.jv251.domain.Account;

public class AccountService {
	public AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void addAccount(Account account) {
		accountDao.addAccount(account);
	}
	
	public List<Account> getAccountBySsn(String ssn) {
		return accountDao.findAccountsBySsn(ssn);
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		return accountDao.findAccountByAccountNum(accountNum);
	}
	
	public void getUpdateBalance(String accountNum, double balance) {
		accountDao.updateBalance(accountNum, balance);
	}
	
	/*
	 * XXX-XX-XXXX 형식의 계좌번호 생성
	 * 
	 * */
	public String generateAccountNum() {
//		Random rand_num = new Random();
//		String num = "";
//		for(int i = 0; i < 9; i++) {
//			int n = rand_num.nextInt(10) + 10;
//		}
		return "111-11-1111";
	}
}
