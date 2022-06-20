package com.varxyz.banking.service;

import java.util.Collection;
import com.varxyz.banking.domain.Customer;

/*
 * CustomerService : Customer에 대한 서비스를 처리하는 클래스
 * 1. 주요 메소드
 * -.addCustomer() : 신규 고객 추가
 * -.getCustomerBySsn : 주민번호로 고객 조회
 * -.getAllCustomers() : 전체 고객 목록
 * -.getNumOfCustomers() : 전체 고객 수
 * 2. 기타
 * -.CustomerService는 고객의 정보를 보관할 수 있는 속성을 유지해야 한다.
 * -.고객의 정보를 유지할 수 있는 속성을 정의하라.
 * 
 * */

public interface CustomerService {
	
	public void addCustomer(Customer customer); // 신규 고객 추가
	
	public Customer getCustomerBySsn(String ssn); // 주민번호로 고객 조회
	
	public Collection<Customer> getAllCustomers(); // 전체 고객 목록
	
	public int getNumOfCustomers(); // 전체 고객 수
}
