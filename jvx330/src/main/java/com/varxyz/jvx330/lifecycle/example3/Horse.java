package com.varxyz.jvx330.lifecycle.example3;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.varxyz.jvx330.lifecycle.AppConfig;

public class Horse implements InitializingBean, DisposableBean{
	private static int count;
	
	@PostConstruct
	public void initMenuData() {
		
	}
	
	public Horse() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertieSet 호출");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("horse destroy 호출");
	}
	
	public static void main(String[] args) {
		GenericApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		context.getBean("horse", Horse.class);
		context.getBean("horse", Horse.class);
		context.getBean("horse", Horse.class);
		System.out.println(Horse.getCount());
		context.close();
	}
}
