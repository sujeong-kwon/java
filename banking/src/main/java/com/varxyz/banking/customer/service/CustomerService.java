package com.varxyz.banking.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varxyz.banking.customer.dao.AddCustomerDao;
import com.varxyz.banking.customer.domain.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private AddCustomerDao addCustomerDao;
	
	public void addCustomer(Customer customer) {
		addCustomerDao.addCustomer(customer);
	}
	
}
