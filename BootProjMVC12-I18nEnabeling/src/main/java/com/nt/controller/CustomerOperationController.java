package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.module.Customer;

@Controller
public class CustomerOperationController {
	
	@GetMapping("/")
	public String showHomePage() {
		System.out.println("CustomerOperationController.showHomePage()");
		return "welcome";
	}
	@GetMapping("/register")
	public String showCustomerFormPage(@ModelAttribute("cust") Customer cust,Map<String,Object>map) {
		System.out.println("CustomerOperationController.showCustomerFormPage()");
		return "customer_registration";
		
	}
	@PostMapping("/register")
	public String customerFormProcessingPage(@ModelAttribute("cust") Customer cust,Map<String,Object>map) {
	     System.out.println("CustomerOperationController.customerFormProcessingPage()");
	     map.put("result",cust);
	     
		return "customer_resultpage";
		
	}

}
