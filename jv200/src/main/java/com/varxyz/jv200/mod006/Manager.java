package com.varxyz.jv200.mod006;

public class Manager extends Employee {
	public String department;
	
	@Override
	public String getDetails() {
		return super.getDetails() + "\nDepartment: " + department;
	}
	
}
