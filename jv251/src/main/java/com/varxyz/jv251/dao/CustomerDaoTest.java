package com.varxyz.jv251.dao;

import java.util.List;

import com.varxyz.jv251.domain.Customer;

public class CustomerDaoTest {

	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		
		// findAllCustomers()
		List<Customer> customerList = dao.findAllCustomers();
		for(Customer customer : customerList) {
			System.out.println(customer.toString());
		}
		
		System.out.println("-------------------------------");
		
		// find
		Customer customer = dao.findCustomerBySsn("901213-1234567");
		System.out.println(customer);
		System.out.println("-------------------------------");
		
		// add
		Customer c = new Customer();
		c.setName("공명");
		c.setSsn("990623-123467");
		c.setPhone("010-8888-9999");
		c.setUserId("spring");
		c.setPasswd("1234");
		
		dao.addCustomer(c);
	}
}
