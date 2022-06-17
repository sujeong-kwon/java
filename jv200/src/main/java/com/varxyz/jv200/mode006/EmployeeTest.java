package com.varxyz.jv200.mode006;

import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Manager();
		e.name = "유비";
		e.salary = 200.5;
		Manager b = (Manager)e;
		b.department = "군사";
		if (e instanceof Manager) {
			Manager ei = (Manager) e;
			
		}
		String detail = e.getDetails();
		System.out.println(detail);
		
		Engineer my = new Engineer();
		my.name = "박상훈";
		System.out.println(my.getDetails());
		
		Manager m = new Manager();
		m.name = "장비";
		m.salary = 500;
		m.department = "장군";
		System.out.println(m.getDetails());
	}
}
