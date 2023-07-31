package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Student;

@Controller
public class StudentOpertionController {
	
	@GetMapping("/")
	public String showHomePage() {
		//return LVN (homePage---->welcom.jsp)
		return "welcome";
	}
	/*
	@GetMapping("/register")
	public String showStudentHomePage(@ModelAttribute("stud") Student st) {
		//return LVN (FormPage welcom.jsp)
		return "student_register";
	}
	@PostMapping("/register")
	public String registerStudent(Map<String,Object>map,@ModelAttribute("stud")Student st) {
		//generate result
		String result=null;
		if(st.getAvg()>=95)
			result= st.getSname()+" has Got First class with distintion for having "+st.getAvg()+" avg ";
		else if(st.getAvg()>=60&&st.getAvg()<85)
			result=st.getSname()+" Got First DIvision for having "+st.getAvg()+" avg ";
		else if(st.getAvg()>=50&&st.getAvg()<60)
			result=st.getSname()+" Got Seacond DIvision for having "+st.getAvg()+" avg ";
		else if(st.getAvg()>=30&&st.getAvg()<50)
			result=st.getSname()+" Got Third Division for having "+st.getAvg()+" avg ";
		else
			result=st.getSname()+" FAIL for having "+st.getAvg()+" avg ";
		//keep result in model attribute
		map.put("result", result);
		
		//return LVN
		return "show_result";
	}
	*/
	@GetMapping("/data")
	public String process(@RequestParam("sno") int no,@RequestParam(defaultValue = "RRR") String name) {
		System.out.println(no+"<----------------->"+name);
		return "show_result";
	}

}
