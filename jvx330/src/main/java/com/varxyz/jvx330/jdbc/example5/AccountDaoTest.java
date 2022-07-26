package com.varxyz.jvx330.jdbc.example5;

import java.util.Date;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Account;
import com.varxyz.jvx330.jdbc.Customer;
import com.varxyz.jvx330.jdbc.DataSourceConfig;
import com.varxyz.jvx330.jdbc.example4.CustomerDao;

public class AccountDaoTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		AccountDao dao = context.getBean("accountDao", AccountDao.class);
		addAccount(dao);
//		findAllAccounts(dao);
//		findAccountsBySsn(dao);
//		findAccountsByCustomerId(dao);
		context.close();
	}
	
	public static void addAccount(AccountDao dao) {
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("222-22-2222");
		sa.setBalance(2000.0);
		sa.setCustomer(new Customer(1001));
		sa.setInterestRate(1.5);
		sa.setRegDate(new Date());
		sa.setAccType('S');
		dao.addAccount(sa);
		System.out.println("-inserted-");
	}
	
	public static void findAllAccounts(AccountDao dao) {
		System.out.println("[findAllAccounts()]");
		dao.findAllAccounts().forEach(a -> System.out.println(a));
	}
	
	public static void findAccountsBySsn(AccountDao dao) {
		System.out.println("[findAccountsBySsn()]");
		List<Account> list = dao.findAccountsBySsn("800111-1234567");
		
		for(Account account : list) {
			System.out.println(account);
		}
	}
	
	public static void findAccountsByCustomerId(AccountDao dao) {
		System.out.println("[findAccountsByCustomerId()]");
		List<Account> list = dao.findAccountsByCustomerId(1001);
		
		for(Account account : list) {
			System.out.println(account);
		}
	}

}
