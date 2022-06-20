package com.varxyz.banking.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.varxyz.banking.domain.Customer;

public class CustomerServiceImpl implements CustomerService{
	private Map<String, Customer> map = new HashMap<>();

	@Override
	public void addCustomer(Customer customer) {
		if(!map.containsKey(customer.getSsn())) {
			map.put(customer.getSsn(), customer);
		}
	}

	@Override
	public Customer getCustomerBySsn(String ssn) {
		if(map.containsKey(ssn)) {
			return map.get(ssn);
		}
		return null;
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		return map.values();
	}

	@Override
	public int getNumOfCustomers() {
		return map.size();
	}
}
