package com.varxyz.banking.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.varxyz.banking.customer.domain.Customer;
import com.varxyz.banking.customer.service.CustomerService;

@Controller("controller.addCustomerController")
public class AddCustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer/add_customer")
	public String addCustomerForm() {
		return "/customer/add_customer";
	}
	
	@PostMapping("/customer/add_customer")
	public String addCustomer(Customer customer, Model model) {
		System.out.println(customer.getEmail());
		customerService.addCustomer(customer);
		model.addAttribute("customer", customer);
		return "customer/success_add_customer";
	}

}
