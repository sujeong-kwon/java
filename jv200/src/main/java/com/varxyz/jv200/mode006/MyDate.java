package com.varxyz.jv200.mode006;

public class MyDate extends Employee {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int yaer) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Object o) {
		if(o instanceof MyDate) {
			MyDate d = (MyDate)o;
			if(d.day == day && d.month == month && d.year == year) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyDate d1 = new MyDate(27, 8, 1996);
		MyDate d2 = new MyDate(27, 8, 1996);
		System.out.println(d1.equals(d2));
	}
	
}
