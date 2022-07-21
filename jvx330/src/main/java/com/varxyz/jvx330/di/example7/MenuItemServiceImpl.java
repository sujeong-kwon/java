package com.varxyz.jvx330.di.example7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("menuItemService") // bean name 설정하는 코드
public class MenuItemServiceImpl implements MenuItemService{
	
	@Autowired
	private MenuItemDao itemDao;
	
//  위의 Autowired가 동작하는 것
//	public MenuItemServiceImpl(MenuItemDao itemDao) {
//		this.itemDao = itemDao;
//	}
	
	@Override
	public void addMenuItem(MenuItem item) {
		itemDao.save(item);
	}
	
	@Override
	public List<MenuItem> getAllMenuItemList(){
		return itemDao.findAllMenuItemList();
	}
	
	@Override
	public MenuItem getMenuItem(String name) {
		return itemDao.findByName(name);
	}
}
