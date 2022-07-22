package com.varxyz.jvx330.lifecycle.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.varxyz.jvx330.lifecycle.AppConfig;

public class Goat {
//	Goat의 빈을 여러개 만들고 Goat의 count가 1이여야한다.
	private static int count;
	
	public Goat() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		GenericApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		context.getBean("goat", Goat.class);
		context.getBean("goat", Goat.class);
		context.getBean("goat", Goat.class);
		System.out.println("Goat's final name : " + Goat.getCount());
		context.close();
	}
}
