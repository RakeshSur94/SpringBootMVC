package com.nt.controller;

import java.beans.Beans;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
@RequestMapping("/employee")
public class EmployeeOperation {
	@Autowired
	private IEmployeeMgmtService empService;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/register")
	public String getEmployeeFormPage(@ModelAttribute("emp") Employee emp) {
		return "register_form";
	}
	@PostMapping("/register")
	public String processEmployeeFormPage(@ModelAttribute("emp") Employee emp,RedirectAttributes rtts) {
		//use service
		String saveEmp=empService.registerEmployee(emp);
		//send result to model class attribute
		rtts.addFlashAttribute("empData", saveEmp);
		return "redirect:allemp";
		
	}
	
	@GetMapping("/allemp")
	public String getAllEmployee(Map<String,Object>map) {
		//use service
		List<Employee>result=empService.getAllEmployee();
		//send result to model attribute
		map.put("result_emp", result);
		return "all_empDetails";
	}
	@GetMapping("/edit_emp")
	public String updateEmployeePage(@ModelAttribute("emp")Employee emp,@RequestParam("no") int no) {
		Employee emp1=empService.getEmployeeById(no);
		BeanUtils.copyProperties(emp1, emp);
		return "update_emp";
		
	}
	@PostMapping("/edit_emp")
	public String updateEmployeePageProcessing(@ModelAttribute("emp") Employee emp,RedirectAttributes rtt) {
		//use service
		String update=empService.updateEmployeeById(emp);
		
		//use flas attribute
		rtt.addFlashAttribute("update_emp",update);
		return "redirect:allemp";
	}
	@GetMapping("/delete_emp")
	public String deleteEmployeePageProcessing(@RequestParam("no") int no,RedirectAttributes rtt) {
		//use service
		String deleted=empService.deleteEmployeeById(no);
		//use flas attribute
		rtt.addFlashAttribute("remove_emp",deleted);
		return "redirect:allemp";
	}
	@GetMapping("/pagination")
	public String paginationPage(@PageableDefault(page = 0,size = 2,sort = "job",direction = Sort.Direction.ASC)Map<String,Object>map,Pageable pageable) {
		//use service
		Page<Employee> empPage=empService.getEmployeeByPage(pageable);
		//put result in model attribute
				map.put("empPageData", empPage);
				//return lvn
				return "show_employee_report_by_page";
	}
	
	@GetMapping("/add_emp")
	public String addNewEmployeePage(@ModelAttribute("emp") Employee emp) {
		return "add_new_employee";
	}
	@PostMapping("/add_emp")
	public String addNewEmpoyeePageProcess(@ModelAttribute("emp")Employee emp,RedirectAttributes rtts) {
		//use service
		String addEmp=empService.registerEmployee(emp);
		rtts.addFlashAttribute("update_emp",addEmp);
		return "redirect:allemp";
	}
	

}
