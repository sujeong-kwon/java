package com.varxyz.banking.domain;

import com.varxyz.banking.domain.customer.Customer;
import com.varxyz.banking.domain.customer.CustomerService;
import com.varxyz.banking.domain.customer.CustomerServiceImpl;
import com.varxyz.banking.domain.service.AccountServiceImpl;
import com.varxyz.jv251.exception.AccountService;

public class AccountTest {

	public static void main(String[] args) {
		CustomerService customerservice = CustomerServiceImpl.getInstance();
		AccountService accountservice = AccountServiceImpl.getInstance();
		Customer c1 = new Customer();
		c1.setName("유비");
		c1.setSsn("990000-0000000");
		c1.setPhone("010-0000-0000");
		c1.setCustomerId("11");
		c1.setPasswd("1234");
		Account a1 = new Account("3333-1111", 1000);
//		c1.setAccountlist(null);
//		c1.setAccountlist(accountservice.createSavingAccount("3333-1111", 1000.0, 1.3));
//		customerservice.addCustomer(c1);
		System.out.println(c1.getName());
		System.out.println(customerservice.getCustomerBySsn("990000-0000000"));
		System.out.println(customerservice.getAllCustomers());
		System.out.println(customerservice.getNumOfCustomers());
//		System.out.println(accountservice.addAccount(a1));
		accountservice.createSavingAccount("3333-1111", 1000.0, 1.3);
//		accountservice.addAccount(a1);
		System.out.println(accountservice.getAccountByAccountNum("3333-1111"));
	}
}
