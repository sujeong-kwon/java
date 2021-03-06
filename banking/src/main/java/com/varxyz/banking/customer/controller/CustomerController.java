package com.varxyz.banking.customer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.varxyz.banking.customer.domain.Customer;
import com.varxyz.banking.customer.service.CustomerService;

@Controller("controller.customerController")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer/add_customer")
	public String addCustomerForm() {
		return "customer/add_customer";
	}
	
	@PostMapping("/customer/add_customer")
	public String addCustomer(Customer customer, Model model) {
		System.out.println(customer.getEmail());
		customerService.addCustomer(customer);
		model.addAttribute("customer", customer);
		return "customer/success_add_customer";
	}
	
	@GetMapping("/customer/login")
	public String loginForm() {
		return "customer/login";
	}
	
//	@PostMapping("/customer/login")
//	public String login(@RequestParam String userId,
//			  @RequestParam String passwd) {
//		System.out.println(userId);
//		
//		if(!customerService.isValidUser(userId, passwd)) {
//			return
//		}
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("userId", userId);
//		mav.addObject("passwd", passwd);
//		mav.setViewName("example3/login_result");
//		
//		return mav;
//	}
	
	@PostMapping("/customer/login")
	public String login(HttpServletRequest request) {
		String email = request.getParameter("email");
		System.out.println(email);
		String passwd = request.getParameter("passwd");
		List<Customer> customers = customerService.isValidUser(email, passwd);
		
		if(customers.size() == 0) {
			System.out.println("x");
			return "customer/add_customer";
		}
		
		HttpSession session = request.getSession(true);
		session.setAttribute("email", email);
		session.setAttribute("cid", customers.get(0).getCid());
		request.setAttribute("name", customers.get(0).getName());
		
		return "customer/login_result";
	}
	
	@GetMapping("/customer/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "home";
	}
}
