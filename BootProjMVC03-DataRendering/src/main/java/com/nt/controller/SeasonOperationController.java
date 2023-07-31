package com.nt.controller;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Employee;
import com.nt.service.ISeasonFinderService;

@Controller
public class SeasonOperationController {
	
	@Autowired
	private ISeasonFinderService service;
	
	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}
	@GetMapping("/season")
	public String showSeason(Map<String,Object>map) {
		//use service
		String result=service.findSeason();
		//keep result in model attribute
		map.put("resultmssg", result);
		
		//put simple value to model Attribute
				map.put("name","Raja");
				map.put("age", "30");
				//passing collection and arrays
				map.put("CompanyList",new String[] {"Emami","Adanai","Ruchi"});
				map.put("Employeename", List.of("Rakesh","Sanjay","Siddhartha"));
				map.put("Salary",Map.of("Sanjay",4000,"Rakesh",50000,"Siddhartha",60000));
				map.put("PhoneNumber",Set.of(999999L,777777L,666666L));
				
				
				  Employee emp=new Employee(); 
				  emp.setEname("Rakesh"); emp.setEjob("DSC");
				  emp.setAge(30); 
				  //passing model class object 
				  map.put("empinfo", emp);
				 
					
					  //create collection of Model Class 
				  List<Employee>listinfo=List.of(new
					  Employee("Smeer","Instru",40), new Employee("Raja","Elect",20));
				  //add  collection model class object to model attribute
					  map.put("emplist", listinfo);
					 
				
		//return LVN
		return "display";
	}
	

}
