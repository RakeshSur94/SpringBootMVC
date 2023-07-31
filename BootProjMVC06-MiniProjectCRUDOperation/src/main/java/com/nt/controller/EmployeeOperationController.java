package com.nt.controller;

import java.util.List;
import java.util.Map;

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

import com.nt.module.EmployeeInfo;
import com.nt.service.IEmployeeService;
import com.nt.validator.EmployeeValidator;

@Controller
public class EmployeeOperationController {
	@Autowired
	private IEmployeeService eService;

	@Autowired
	private EmployeeValidator empValidator;

	@GetMapping("/")
	public String showHomePage() {
		return "show_home";
	}

	@GetMapping("/report")
	public String showEmployee(Map<String, Object> map) {
		// user service
		List<EmployeeInfo> list = eService.getEmployee();
		// add result in model attribute
		map.put("emplist", list);
		return "employee_page";
	}

	@GetMapping("/emp_add")
	public String showEditPageForEmployeeRegister(@ModelAttribute("emp") EmployeeInfo emp) {
		return "register_new_employee";

	}

	@PostMapping("/emp_add")
	public String showEmployeeEditPage(@ModelAttribute("emp") EmployeeInfo emp, RedirectAttributes attr,
			BindingResult errors) {
		System.out.println("EmployeeOperationController.showEmployeeEditPage()");
		// enable server validation logic only when client validation logic are not done
		if (emp.getVflag().equalsIgnoreCase("no")) {
			System.out.println("server side form validation logic");

			// user validator
			if (empValidator.supports(EmployeeInfo.class)) {
				empValidator.validate(emp, errors);
				if (errors.hasErrors()) // if form validation error message are found
					return "register_new_employee";
			}
			// application logic error
			if (eService.isDesignRejectList(emp.getJob()))
				errors.rejectValue("job", "emp.desg.reject");

		}
		// user service
		String result = eService.registerEmployee(emp);
		// add result in flash attribute
		attr.addFlashAttribute("resultmsg", result);
		return "redirect:report";
	}

	@GetMapping("/contact")
	public String showContactInfo(Map<String, Object> map) {
		map.put("Rakesh", List.of("Santia", "Odisha", "9456214L"));
		return "employee_page";

	}

	@GetMapping("/edit_emp")
	public String showEditEmployeePage(@RequestParam("no") int no, @ModelAttribute("emp") EmployeeInfo emp) {
		// use service
		EmployeeInfo emp1 = eService.getEmployeeByEmpNo(no);
		// copy date
		BeanUtils.copyProperties(emp1, emp);
		// return LVN
		return "update_employee";

	}

	@PostMapping("edit_emp")
	public String showAfterEditEmployeeDetails(@ModelAttribute("emp") EmployeeInfo emp, RedirectAttributes attr,
			BindingResult errors) {
		System.out.println("EmployeeOperationController.showAfterEditEmployeeDetails()");
		if (emp.getVflag().equalsIgnoreCase("no")) {
			System.out.println("server side form validation logic");

			// user validator
			if (empValidator.supports(EmployeeInfo.class)) {
				empValidator.validate(emp, errors);
				// application logic error
				if (eService.isDesignRejectList(emp.getJob()))
					errors.rejectValue("job", "emp.desg.reject");

				if (errors.hasErrors()) // if form validation error message are found
					return "update_employee";

			}
		}
		// use service
		String result = eService.updateEmployee(emp);
		// add result in flash Attribute
		attr.addFlashAttribute("resultmsg", result);
		return "redirect:report";
	}

	@GetMapping("delete_emp")
	public String delteEmployee(@RequestParam("no") int no, RedirectAttributes attr) {
		// use servie
		String result = eService.removeEmployeeByNo(no);
		// add result in flash Attribute
		attr.addFlashAttribute("resultmsg", result);
		//
		return "redirect:report";
	}

	@ModelAttribute("deptNoInfo")
	public List<Integer> refdateForDeptNoSelectBox() {
		// use service
		return eService.fetchAllDepartment();
	}
	
	@GetMapping("/report_emp_page")
	public String showEmployeeReport(@PageableDefault(page = 0,size = 3,sort = "job",direction = Sort.Direction.ASC)
	Pageable pageable,Map<String,Object>map) {
		System.out.println("EmployeeOperationController.showEmployeeReport()");
		//user service
		Page<EmployeeInfo>page=eService.getEmployeeDataByPage(pageable);
		//put result in model attribute
		map.put("empData", page);
		//return lvn
		return "show_employee_report";
	}
	
	@GetMapping("/emp_no")
	public String showgetEmployeByIdPage(@ModelAttribute("emp") EmployeeInfo emp ) {
		return "get_emp";
		
	}
	
	@PostMapping("/emp_no")
	public String getEmployeById(@ModelAttribute("emp") EmployeeInfo emp,Map<String,Object>map) {
		//user service
		String result=eService.getEmployeeByNo(emp.getEmpno());
		//use model attribute
		map.put("empData", result);
		return "EmpDetailsById";
		
	}

}
