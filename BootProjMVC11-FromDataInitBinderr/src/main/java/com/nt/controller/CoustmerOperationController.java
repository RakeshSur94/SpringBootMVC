package com.nt.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.nt.model.Coustmer;



@Controller
public class CoustmerOperationController {

private	static Logger logger= LoggerFactory.getLogger(CoustmerOperationController.class);
	
	
	
	
	@GetMapping("/")
	public String showHome() {
		logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
		return "welcome";
	
	}
	@GetMapping("/register")
	public String showCoustomerRegsitrationPage(@ModelAttribute("cust") Coustmer cust) {
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
		return "coustmer_page";
		
	}
	@PostMapping("/register")
	public String coustomerRegsitrationProcess(@ModelAttribute("cust") Coustmer cust,Map<String,Object>map) {
		logger.info("Customer Resgistration porcessing");
	
		System.out.println("model data obj "+cust);
		//add model attribute
		map.put("custData",cust);
		//return lvn
		return "show_result";
		
	}
	
	@InitBinder
	public void myInitBinder(WebDataBinder binder) {
		logger.debug("DataBinder with the help of WEBDataBInder");
		System.out.println("CoustmerOperationController.myInitBinder()");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, false));
		
	}

}
