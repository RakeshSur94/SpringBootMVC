package com.nt.controller;

import java.beans.Beans;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.module.Employee;
import com.nt.module.EmployeeFileInfo;
import com.nt.module.EmployeeLeave;
import com.nt.service.IEmployeeMgmtService;
import com.nt.validation.EmployeeValidation;

@Controller
public class EmployeeOperationController {

	@Autowired
	private IEmployeeMgmtService empService;
	@Autowired
	private EmployeeValidation validation;

	@GetMapping("/")
	public String showHomePage(Map<String, Object> map) {
		// use servie
		// Employee emp= new Employee();
		String wishmssg = empService.wishMessageGenerator("Rakesh");
		map.put("wish", wishmssg);
		return "home";
	}

	@GetMapping("/emp_regis")
	public String registerEmployeeFormPage(@ModelAttribute("emp") Employee emp) {
		return "reg_form";

	}

	@PostMapping("/emp_regis")
	public String registerEmployeeFormProcessPage(@ModelAttribute("emp") Employee emp, RedirectAttributes rtts,
			BindingResult erros) {
		// form validation logic
		if (validation.supports(Employee.class)) {
			validation.validate(emp, erros);

			if (empService.isDesgRejected(emp.getDesg()))
				erros.rejectValue("desg", "spring.desg.reject");
			if (erros.hasErrors())
				return "reg_form";

		}

		// user service
		String result = empService.saveEmployeeDetails(emp);
		rtts.addFlashAttribute("savedEmployee", result);

		return "redirect:allEmployee";

	}

	@GetMapping("/get_leavepage")
	public String showEmployeeLeavePage(@ModelAttribute("emp") EmployeeLeave empLeave) {
		return "empLeave";

	}

	@PostMapping("/get_leavepage")
	public String employeeLeavePageProcessing(@ModelAttribute("emp") EmployeeLeave empLeave, RedirectAttributes rtts) {

		// use service
		String leave = empService.saveEmployeeLeave(empLeave);
		// add result in model attribute
		rtts.addFlashAttribute("emp_leave", leave);
		return "redirect:allEmployee";

	}

	@GetMapping("/leavedetails")
	public String getAllleaveDetails(Map<String, Object> map) {
		// use service
		List<EmployeeLeave> leaveList = empService.getLeaveDetais();
		// add result in model attribute
		map.put("leave_page_allemp", leaveList);
		return "leave";

	}

	@GetMapping("/allEmployee")
	public String getAllEmployee(Map<String, Object> map) {
		// use service
		List<Employee> result = empService.getAllEmployee();
		// add result in model attribute
		map.put("allEmp", result);
		return "all_emp_page";
	}

	@ModelAttribute("empidinfo")
	public List<Integer> refdateForEmpIdSelectBox() {
		return empService.getAllEmpId();
	}
	@ModelAttribute("empnameinfo")
	public List<String>refdateForEmpNameSelectBox(){
		return empService.getAllEmpName();
	}

	@GetMapping("/emp_edi")
	public String editFormPage(@ModelAttribute("emp") Employee emp, @RequestParam("no") int no) {

		// use service
		Employee emp1 = empService.getEmployeeById(no);
		// copy data
		BeanUtils.copyProperties(emp1, emp);
		return "update_emp";
	}

	@PostMapping("/emp_edit")
	public String addNewEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes rtts, BindingResult erros) {
		// validation logic
		if (validation.supports(Employee.class)) {
			validation.validate(emp, erros);
			if (empService.isDesgRejected(emp.getDesg()))
				erros.rejectValue("desg", "spring.desg.reject");
			if (erros.hasErrors())
				return "reg_form";

		}
		// use service
		String addEmp = empService.saveEmployeeDetails(emp);
		// keep result in flashAttribute
		rtts.addFlashAttribute("after_edit", addEmp);
		return "redirect:allEmployee";
	}

	@GetMapping("/emp_delete")
	public String addNewEmployee(@RequestParam("no") int no, RedirectAttributes rtts) {
		// use service
		String deleteEmp = empService.deleteEmployeeByid(no);
		// keep result in flashAttribute
		rtts.addFlashAttribute("after_delete", deleteEmp);
		return "redirect:allEmployee";
	}

	@GetMapping("/pagination")
	public String showEmployeeReportByPage(
			@PageableDefault(page = 0, size = 2, sort = "desg", direction = Sort.Direction.ASC) Pageable pageable,
			Map<String, Object> map) {
		// use service
		Page<Employee> page = empService.getAllEmployeeReportByPage(pageable);
		// put the result in model attribute
		map.put("pagingResult", page);
		return "employeeReport_page_by_page";
	}

	@GetMapping("/report")
	public String generateReport(Map<String, Object> map, @RequestParam("type") String type) {
		// use service
		List<Employee> list = empService.getAllEmployee();
		map.put("empData", list);
		if (type.equalsIgnoreCase("pdf"))
			return "pdf_view";
		else
			return "excel_view";

	}

	@GetMapping("/register_empoyee_photo_certificate")
	public String getRegisterEmployeeDocumentPage(@ModelAttribute("emp") EmployeeFileInfo info) {

		return "emp_document";

	}

	private Environment env;

	@PostMapping("/register_empoyee_photo_certificate")
	public String processEmployeeDocument(@ModelAttribute("emp") EmployeeFileInfo info, Map<String, Object> map) {
		// get upload folder file location from properties file
		String fileLocation = env.getRequiredProperty("upload.store");
		// if that is not avaliable create it
		File file = new File(fileLocation);
		if (!file.exists())
			file.mkdir();
		// get inputStream repressing the upload file content
		MultipartFile imagefile = info.getImageFile();
		MultipartFile documentfile = info.getDocument();

		try (InputStream isImage = imagefile.getInputStream(); InputStream isdocument = documentfile.getInputStream();

		) {
			// get the file name
			String imagefileName = imagefile.getOriginalFilename();
			String documetName = documentfile.getOriginalFilename();
			// create outputStream representing empty destination file
			try (OutputStream osimage = new FileOutputStream(file.getAbsolutePath() + "\\" + imagefileName);
					OutputStream osDocument = new FileOutputStream(file.getAbsolutePath() + "\\" + documetName);) {
				// perform file copy opertation
				IOUtils.copy(isImage, osimage);
				IOUtils.copy(isdocument, osDocument);
				// prepare model class object form entity class
				Employee emp = new Employee();
				
				emp.setPhotoPath(file.getAbsolutePath() + "/" + imagefileName);
				emp.setDocumentPath(file.getAbsolutePath() + "/" + documetName);
				String msg = empService.saveEmployeeDetails(emp);
				// keep the uploaded files name and location in model attribute
				map.put("file1", imagefileName);
				map.put("file2", documetName);
				map.put("resultMsg", msg);

			}//try 2
			

		} // try 1
		

		catch (Exception e) {
			e.printStackTrace();
		}
		return "employee_file";

	}
	@GetMapping("/add_emp")
	public String addNewEmployeeFromPage(@ModelAttribute("emp") Employee emp) {
		return "add_new_employee";
	}
	@PostMapping("/add_emp")
	public String addNewEmployeeFromPageProcessing(@ModelAttribute("emp") Employee emp,RedirectAttributes rtts,BindingResult errors) {
		if(validation.supports(Employee.class))
			validation.validate(emp, errors);

		if (empService.isDesgRejected(emp.getDesg()))
			errors.rejectValue("desg", "spring.desg.reject");
		if (errors.hasErrors())
			return "add_new_employee";
		
		
		//use service
		String result = empService.saveEmployeeDetails(emp);
		rtts.addFlashAttribute("savedEmployee", result);
		
		
		return "redirect:allEmployee";
	}

}
