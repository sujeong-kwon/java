package com.varxyz.jvx330.jdbc.example2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Customer;
import com.varxyz.jvx330.jdbc.DataSourceConfig;

public class CustomerDaoTest {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
//		findAllCustomers(dao);
//		findCustomersByRegDate(dao);
//		findCustomersByEmail(dao);
//		countCustomers(dao);
		findCustomersBySsn(dao);
		context.close();
		
	}
	
	public static void findAllCustomers(CustomerDao dao) {
		System.out.println("[findAllCustomers()]");
		dao.findAllCustomers().forEach(c -> System.out.println(c));
	}
	
	public static void findCustomersByRegDate(CustomerDao dao){
		System.out.println("[findCustomersByRegDate()]");
//		Date date = Date.valueOf("2022-07-22");
		SimpleDateFormat format = new SimpleDateFormat("yyyyy-MM-dd"); 
		Date currentDate = null;
		try {
			currentDate = format.parse(format.format(new Date()));
		}catch(ParseException e) {
			e.printStackTrace();
		}
		List<Customer> list = dao.findCustomersByRegDate(currentDate);
		for(Customer customer : list) {
			System.out.println(customer);
		}
	}

	public static void findCustomersByEmail(CustomerDao dao) {
		System.out.println("[findCustomersByEmail()]");
		Customer c = dao.findCustomersByEmail("yubi@java.com");
		System.out.println(c);
	}
	
	public static void countCustomers(CustomerDao dao) {
		System.out.println("[countCustomers()]");
		long count = dao.countCustomers();
		System.out.println(count);
	}
	
	public static void findCustomersBySsn(CustomerDao dao) {
		System.out.println("[findCustomersBySsn()]");
		Customer c = dao.findCustomersBySsn("ee");
		System.out.println(c);
	}
}
