package com.varxyz.jvx330.di.example6;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AutowireTest {
	public static void main(String[] args) {
		String config = "com/varxyz/jvx330/di/example6/beans.xml";
		GenericApplicationContext context = new GenericXmlApplicationContext(config);
		
		MenuItemController controller = context.getBean("menuItemController", MenuItemController.class);
		controller.processRequest();
		context.close();
	}
}
