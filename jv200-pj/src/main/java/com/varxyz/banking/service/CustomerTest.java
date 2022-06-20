package com.varxyz.banking.service;

import com.varxyz.banking.domain.Account;
import com.varxyz.banking.domain.AccountService;
import com.varxyz.banking.domain.AccountServiceImpl;
import com.varxyz.banking.domain.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		CustomerService constomerservice = new CustomerServiceImpl2();
		AccountServiceImpl accountservice = new AccountServiceImpl();
		Customer c1 = new Customer();
		c1.setName("유비");
		c1.setSsn("990000-0000000");
		c1.setPhone("010-0000-0000");
		c1.setCustomerId("11");
		c1.setPasswd("1234");
		c1.setAccountlist(accountservice.createSavingAccount("3333-1111", 1000.0, 1.3));
		constomerservice.addCustomer(c1);
		System.out.println(c1.getName());
		System.out.println(constomerservice.getCustomerBySsn("990000-0000000"));
		System.out.println(constomerservice.getAllCustomers());
		System.out.println(constomerservice.getNumOfCustomers());
	}

}
