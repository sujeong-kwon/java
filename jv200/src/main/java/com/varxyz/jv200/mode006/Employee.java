package com.varxyz.jv200.mode006;

public class Employee{
	protected String name;
	double salary;
	public MyDate birthDate;
	public String getDetails() {
		return "Name: " + name + "\nSalary: " + salary + 
				"\nbirthDay: " + birthDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public MyDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Employee) {
			Employee o1 = (Employee) o;
			if(name.equals(o1.name) 
					&& birthDate.equals(o1.birthDate)) {
				return true;
			}			
		}
		return false;
	}
	
}
