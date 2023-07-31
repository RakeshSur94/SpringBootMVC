package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.module.Employee;
import com.nt.service.IEmployeeServiceMgmt;

@Controller
public class EmployeeOperationController {
	
	@Autowired
	private IEmployeeServiceMgmt empService;
	
	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}
	
	@GetMapping("/report")
	public String generateReport(Map<String,Object>map,@RequestParam("type") String type) {
		//use service
		List<Employee>list=empService.getAllEmployee();
		//add to model attribute
		map.put("empData", list);
		//return lvn
		if(type.equalsIgnoreCase("excel"))
			return "excel_view";
		else
			return "pdf_view";
		
		
	}

}
