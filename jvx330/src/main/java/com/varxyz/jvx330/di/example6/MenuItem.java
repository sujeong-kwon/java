package com.varxyz.jvx330.di.example6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MenuItem {
	private String name;
	private double price;
	
	public String toString() {
		return "MenuItem[name=" + name + ", price=" + price + "]";
	}
}
