package com.varxyz.banking.customer.dao;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.varxyz.banking.customer.domain.Customer;

@Component("addCustomerDao")
public class AddCustomerDao {
private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AddCustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer (email, passwd, name, ssn, phone)"
				+ " VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, customer.getEmail(), customer.getPasswd(),
				customer.getName(), customer.getSsn(), customer.getPhone());		
	}
}
