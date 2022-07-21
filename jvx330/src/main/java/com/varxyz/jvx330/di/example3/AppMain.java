package com.varxyz.jvx330.di.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
//		xml방식
//		String config = "com/varxyz/jvx330/di/example3/beans.xml";
//		GenericApplicationContext context = new GenericXmlApplicationContext(config);
//		
//		MemberService memservice = context.getBean("memberService", MemberService.class);
//		System.out.println(memservice.getAllMembers());
//		context.close();
		
//		class방식
		GenericApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MemberService service = context.getBean("memberService", MemberService.class);
		service.getAllMembers().forEach(member -> System.out.println(member));
//		List<Member> list = service.getAllMembers();
//		for(Memeber member : list) {
//			System.out.println(member);
//		}
		context.close();
	}

}
