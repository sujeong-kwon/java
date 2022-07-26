package com.varxyz.banking.account.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.varxyz.banking.account.domain.Account;
import com.varxyz.banking.account.service.AccountService;
import com.varxyz.banking.customer.domain.Customer;

@Controller("controller.accountController")
public class AccountController {
	
	AccountService accountService = new AccountService();
	
	@GetMapping("/account/add_account")
	public String addAccountForm() {
		return "/account/add_account";
	}
	
//	@PostMapping("/account/add_account")
//	public String login(Account account, Model model) {		
//		System.out.println(account.getAccType());
//		accountService.addAccount(account);
//		model.addAttribute("accountNum", "111-11-1111");
//		model.addAttribute("account", account);
//		return "account/success_add_account";
//	}
	
	@PostMapping("/account/add_account")
	public String login(HttpServletRequest request, Model model) {
		System.out.println("진입");
		String accType = request.getParameter("accType");
		char accType_char = accType.charAt(0);
		String cid = request.getParameter("cid");
		Long cid_long = Long.parseLong(cid);
		String accountNum = "111-11-111";
		Account account = new Account();
		account.setAccType(accType_char);
		account.setCustomer(new Customer(cid_long));
		account.setAccountNum(accountNum);
		accountService.addAccount(account);
		model.addAttribute("account", account);
		return "account/success_add_account";
	}
}
