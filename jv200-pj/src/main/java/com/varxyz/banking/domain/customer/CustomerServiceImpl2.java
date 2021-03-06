package com.varxyz.banking.domain.customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerServiceImpl2 implements CustomerService{
	private List<Customer> customerList = new ArrayList<>();
	
	@Override
	public void addCustomer(Customer customer) { // 신규 고객 추가
		if(getCustomerBySsn(customer.getSsn()) == null) { // 주민번호로 고객 조회 -> 주민번호가 null이면
			customerList.add(customer); // ArrayList에 새로운 customer 객체 추가
		}
	}

	@Override
	public Customer getCustomerBySsn(String ssn) { // 주민번호로 고객 조회 
		for(Customer c : customerList) { // c는 하나의 customer 객체
			if(ssn.equals(c.getSsn())) { // 파라미터로 받은 주민번호와 customer의 주민번호가 일치하다면
				return c; // 객체를 리턴한다.
			}
		}
		return null; // 만약 일치하지 않는다면 null을 리턴한다.
	}

	@Override
	public Collection<Customer> getAllCustomers() { // 전체 고객 목록
		return customerList; // ArrayList를 리턴한다.
	}

	@Override
	public int getNumOfCustomers() { // 전체 고객 수
		return customerList.size(); // ArrayList의 길이를 리턴한다.
	}
}
