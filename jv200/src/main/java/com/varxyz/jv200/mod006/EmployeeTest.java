package com.varxyz.jv200.mod006;

import java.util.Date;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "유비";
		e.salary = 1000.0;
		e.birthDate = new MyDate(10, 4, 2000);
		String detail = e.getDetails();
//		System.out.println(e.birthDate);
		
		Manager m = new Manager();
		m.department = "영업부";
		m.name = "관우";
		m.salary = 200.0;
//		System.out.println(m.getDetails());
		
		Director d = new Director();
		d.name = "장비";
		d.salary = 3000.0;
		System.out.println(d.getDetails());
		
		Engineer en = new Engineer();		
	}

}
