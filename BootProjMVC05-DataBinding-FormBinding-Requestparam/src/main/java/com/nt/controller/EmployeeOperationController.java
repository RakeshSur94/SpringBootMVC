package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.module.Employee;
import com.nt.service.IEmployeeService;

@Controller
public class EmployeeOperationController {
	@Autowired
	private IEmployeeService eService;
	
	@GetMapping("/")
	public String showHomePage() {
		return "home.jsp";
	}
	@PostMapping("/report")
	public String EmployeeFormProcessing(@ModelAttribute("employee") Employee emp,Map<String,Object>map) {
		//use service
		String result=eService.registerEmployee(emp);
		//keeps result in model attribute
		map.put("resultmsg", result);
		//return LVN
		return "result_page";
	}

}
