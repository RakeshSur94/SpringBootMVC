package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareConcurrentModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ShowHomeController {
	
	
	 
	 /*
	 @RequestMapping("/")
	
	  public String showHomeController() { //return LVN
	  return "welcome";
	  
	  }
	  

	@RequestMapping("/home")
	public String showHomeController() {
		
	
		return "welcome";
	}
	@RequestMapping("/process")
	public String showDate(Map<String,Object>map) {
		//add model attribute to shared memroy
		map.put("attr1","val1");
		map.put("sysDate",new Date());
		return "show_date";
	}
	
	@RequestMapping("/process")
	public String showDate(ModelMap map) {
		System.out.println("ShowHomeController.showDate() ShareMemory object class name "+map.getClass());
		//add model attribute to shared memory
		map.put("attr1","val1");
		map.put("sysDate", LocalDateTime.now());
		return "show_date";
		
	}
	
	@RequestMapping("/process")
	public String showDate(Model map) {
		System.out.println("ShowHomeController.showDate() ShareMemory object class name "+map.getClass());
		//add model attribute to shared memory
		map.addAttribute("attr1","val1");
		map.addAttribute("sysDate", LocalDateTime.now());
		return "show_date";
		
	}

	@RequestMapping("/process")
	 public Model porcess() {
		Model model= new BindingAwareConcurrentModel();
		model.addAttribute("attr1","val1");
		model.addAttribute("sysDate",new Date());
		return model;
		 
	 }
	
	 @RequestMapping("/process")
	 public Map<String,Object>porcess(){
		 Map<String,Object>map=new HashMap<String, Object>();
		 map.put("attr1","val1");
		 map.put("sysDate", new Date());
		 return map;
	 }
	 
	 @RequestMapping("/process")
	 public ModelAndView porcess() {
		 ModelAndView mview=new ModelAndView();
		 //add model attribute to shared memroy
		 mview.addObject("attr1","val1");
		 mview.addObject("sysDate",LocalDateTime.now());
		 mview.setViewName("process");
		 return mview;
	 }
	 
	 //forward request to one handler to another handler method
	 @RequestMapping("/process")
	 public String process() {
		 System.out.println("ShowHomeController.process()");
		 return "forward:report";
		 
	 }
	 @RequestMapping("/report")
	 public String showReport() {
		 System.out.println("ShowHomeController.showReport()");
		 System.out.println("ShowHomeController.process()");
		 return "show_date";
		 
	 }
	 */
	 @RequestMapping("/process")
	 public void process(HttpServletResponse res) throws Exception {
		//set content type
		 res.setContentType("text/html");
		 PrintWriter pw=res.getWriter();
		 pw.println("<b>Direct goes to browser</b>");
		
		 
	 }
	 
	 
	 
	 
	 
	 
}
