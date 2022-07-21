package com.varxyz.jvx330.di.example6;

import java.util.List;

public interface MenuItemService {
	
	void addMenuItem(String name, double price);
	void getAllMenuItems();
	void getMenuItem(String name);
}
