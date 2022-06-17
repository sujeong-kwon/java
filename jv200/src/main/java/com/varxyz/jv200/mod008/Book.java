package com.varxyz.jv200.mod008;

public class Book{
	private int serial;
	private String title;
	private String author;
	
	public Book(int serial, String title, String author){
		this.serial = serial;
		this.title = title;
		this.author = author;
	}
	
	public int getSerial() {
		return serial;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public String getAuthor() {
		return author;
	}
	
}
