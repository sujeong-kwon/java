package com.varxyz.jvx330.di.example6;

import java.util.ArrayList;
import java.util.List;

public class MenuItemServiceImpl implements MenuItemService{
	List<MenuItem> menuItemList = new ArrayList();
	
	public MenuItemServiceImpl() {
		System.out.println("빈 생성 : " + this);
	}
	
	@Override
	public void addMenuItem(String name, double price) {
		MenuItem menuItem = new MenuItem(name, price);
		menuItem.setName(name);
		menuItem.setPrice(price);
		menuItemList.add(menuItem);
		System.out.println("New MenuItem inserted : " + name + "/" + price);
	}
	
	@Override
	public void getAllMenuItems() {
		System.out.println(menuItemList);
	}
	
	@Override
	public void getMenuItem(String name) {
		for(int i=0; i < menuItemList.size(); i++) {
			if(menuItemList.get(i).getName().equals(name)) {
				System.out.println(menuItemList.get(i).getName());
			}
		}
	}
}
