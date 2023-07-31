package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Emami;
import com.nt.service.IEmamiServiceMgmt;
import com.nt.validator.EmployeeValidator;

@Controller
public class EmamiEmpOperationController {
	@Autowired
	private IEmamiServiceMgmt eService;
	@Autowired
	private EmployeeValidator validator;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/employee_emami")
	public String showRegisterEmployeePage(@ModelAttribute("emp") Emami emp) {
		return "registration_page";
	}
	@PostMapping("/employee_emami")
	public String registerEmployee(@ModelAttribute("emp") Emami emp,RedirectAttributes attr,BindingResult errors) {
		// use validator
		if(validator.supports(Emami.class)) {
			validator.validate(emp, errors);
			if(errors.hasErrors()) 
				return "registration_page";
				
			
		}
		
		
		
		//user service
		String result=eService.registerEmployee(emp);
		//add result in model attribute
	attr.addFlashAttribute("empData", result);
		//return lvn
		return "redirect:all_employee";
		
	}
	@GetMapping("/all_employee")
	public String showAllEmployee(Map<String,Object>map) {
		//user service
		List<Emami>list=eService.getAllEmployee();
		//add result in moldel attribute
		map.put("empResult", list);
		//return LVN
		return "all_emp_page";
	}
	
	@GetMapping("/pagebypage")
	public String showEmployeeByPage(@PageableDefault(page = 0,size = 4,sort="name",direction = Sort.Direction.ASC)
			Pageable pageable,Map<String,Object>map) {
		//use service
		Page<Emami> page=eService.getAllPage(pageable);
		//use model attribute
		map.put("pageData", page);
		return "emp_pagination";
		
	}
	@GetMapping("/newemployee")
	public String registerNewEmployeePage(@ModelAttribute("emp") Emami emp) {
		System.out.println("EmamiEmpOperationController.registerNewEmployeePage()");
		return "add_newEmployee";
	}
	@PostMapping("/newemployee")
	public String registerNewEmployeeResult(@ModelAttribute("emp")Emami emp,RedirectAttributes arrt,BindingResult errors) {
		System.out.println("EmamiEmpOperationController.registerNewEmployeeResult()");
		// use validator
		if(validator.supports(Emami.class)) {
			validator.validate(emp, errors);
			if(errors.hasErrors()) 
				return "add_newEmployee";
		}
		//use service
		String result=eService.registerEmployee(emp);
		//user flash attribute
		arrt.addFlashAttribute("empData",result);
		return "redirect:all_employee";
	}
	@GetMapping("/delete_emp")
	public String removeEmployee(@RequestParam("id") int id,RedirectAttributes arrt) {
		//use service
		String result=eService.removeEmployeeById(id);
		//use flash attribute
		arrt.addFlashAttribute("empData",result);
		return "redirect:all_employee";
	}
	
	@GetMapping("/edit_emp")
	public String showEditEmployee(@ModelAttribute("emp") Emami emp) {
		return "update_emp";
	}
	@PostMapping("/edit_emp")
	public String processEditEmployee(@ModelAttribute("emp") Emami emp,RedirectAttributes arrt,BindingResult errors) {
		// use validator
		if(validator.supports(Emami.class)) {
			validator.validate(emp, errors);
			if(errors.hasErrors()) 
				return "update_emp";
		}
		//use service
		String result=eService.updateEmployee(emp);
		//use flash attribute
		arrt.addFlashAttribute("empData",result);
		return "redirect:all_employee";
	}
	
	

}
