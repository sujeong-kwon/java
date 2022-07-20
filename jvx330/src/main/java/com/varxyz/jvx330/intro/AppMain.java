package com.varxyz.jvx330.intro;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		String config = "com/varxyz/jvx330/intro/beans.xml";
		GenericApplicationContext context = new GenericXmlApplicationContext(config);
		Hello hello = context.getBean("helloBean", Hello.class); // close전까지 getBean() 계속 쓸 수 있음
//		Hello hello = new HelloBeanEn();
		System.out.println(hello.sayHello("Spring"));
		context.close();
	}
}
