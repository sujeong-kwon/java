package com.varxyz.jv200.mode006;

public class Manager extends Employee {
	String department;

	//method overriding
	@Override
	public String getDetails() {
		return super.getDetails() + "\nDepartment: " + department;
	}

}
