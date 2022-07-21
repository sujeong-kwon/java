package com.varxyz.jvx330.di.example6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MenuItemController {
	
	@Autowired
	@Qualifier("menuItemService")
	private MenuItemServiceImpl menuItemService;
	
	public MenuItemController() {
		System.out.println("MenuItemController 생성");
	}
	
	public void processRequest() {
		menuItemService.addMenuItem("아메리카노", 1500.0);
		menuItemService.addMenuItem("바닐라라떼", 3500.0);
		menuItemService.getAllMenuItems();
		menuItemService.getMenuItem("아메리카노");
	}
}
