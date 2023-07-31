package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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

import com.nt.module.Employee;
import com.nt.service.IEmployeeServiceMgmt;
import com.nt.validator.EmployeeValidator;

@Controller
public class EmployeeOperation {
	private static Logger log = LoggerFactory.getLogger(EmployeeOperation.class);
	@Autowired
	private IEmployeeServiceMgmt empService;
	@Autowired
	private EmployeeValidator validator;

	@GetMapping("/")
	public String showHome(Map<String, Object> map) {
		log.trace("Home Of the webPage");
		// use service for wish message
		String wishmessage = empService.wishMessage("Rakesh");
		map.put("wish", wishmessage);
		return "home";
	}

	@GetMapping("/getAllEmployee")
	public String getAllEmployee(Map<String, Object> map) {
		log.trace("Gettting ALl Employee Here");
		// user service
		List<Employee> empList = empService.getAllEmployee();
		// add result in model attribute
		map.put("allemp", empList);
		return "EmployeePage";

	}

	@GetMapping("/edit_emp")
	public String editEmployeeFormPage(@ModelAttribute("emp") Employee emp, @RequestParam("no") int no) {
		// use service class
		log.trace("Employee Edited page");
		Employee emp1 = empService.getEmployeeById(no);
		// copy the employee object to form
		BeanUtils.copyProperties(emp1, emp);
		return "editform";
	}

	@PostMapping("/edit_emp")
	public String editEmployeeFormPageProcessing(@ModelAttribute("emp") Employee emp, RedirectAttributes rtts,
			BindingResult errors) {
		if (validator.supports(Employee.class)) {
			validator.validate(emp, errors);

			if (errors.hasErrors())
				return "editform";

		}

		// use service
		log.trace("Employe has been edited");
		String editEmp = empService.registerNewEmployee(emp);
		// add result in flashAttribute
		rtts.addFlashAttribute("editedEmployee", editEmp);
		return "redirect:getAllEmployee";
	}

	@GetMapping("/delete_emp")
	public String deleteEmployee(@RequestParam("no") int no, RedirectAttributes rtts) {
		// use service class
		log.warn("Employee can deleted");
		String deleteEmp = empService.deleteById(no);
		// add result in flashAttribute
		rtts.addFlashAttribute("deleted", deleteEmp);
		return "redirect:getAllEmployee";
	}

	@GetMapping("/add_emp")
	public String addNewEmployeeFormPage(@ModelAttribute("emp") Employee emp) {
		return "addnewEmp";
	}

	@PostMapping("/add_emp")
	public String addNewEmployeeFormPageProcessing(@ModelAttribute("emp") Employee emp, RedirectAttributes rtts,BindingResult errors) {
		if (validator.supports(Employee.class)) {
			validator.validate(emp, errors);

			if (errors.hasErrors())
				return "addnewEmp";

		}
		
		
		// use service
		String addEmp = empService.registerNewEmployee(emp);
		// add result in flashAttribute
		rtts.addFlashAttribute("editedEmployee", addEmp);
		return "redirect:getAllEmployee";
	}

	@GetMapping("/pagebypage")
	public String getEmployeePageByPage(
			@PageableDefault(page = 0, size = 3, sort = "job", direction = Sort.Direction.ASC) Pageable pageable,
			Map<String, Object> map) {
		// use service
		Page<Employee> empPageByPage = empService.getAllEmployeePageByPage(pageable);
		// add result in model attribute
		map.put("empResultPageByPage", empPageByPage);
		return "PageByPage";

	}

	@GetMapping("/pagebypage1")
	public String getEmployeePage(
			@PageableDefault(page = 0, size = 3, sort = "job", direction = Sort.Direction.ASC) Pageable pageable,
			Map<String, Object> map) {
		// use service
		Page<Employee> empPageByPage = empService.getAllEmployeePageByPage(pageable);
		// add result in model attribute
		map.put("empResult", empPageByPage);
		return "PageByPage1";

	}

}
