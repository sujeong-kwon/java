package com.varxyz.jvx340.mvc.example1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	// servlet이라고 생각하기
	@RequestMapping("/example1/sayHello")
	public ModelAndView sayHello() {
		String greeting = "Hello! 스프링 MVC jvx340";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example1/hello");
		mav.addObject("greeting", greeting);
		
		return mav;
	}
}
