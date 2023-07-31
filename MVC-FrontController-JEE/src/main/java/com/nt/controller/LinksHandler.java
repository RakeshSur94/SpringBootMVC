package com.nt.controller;


import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.nt.service.ILinkService;
import com.nt.service.LinkServiceImpl;

public class LinksHandler {
	
	private ILinkService service;
	
	public LinksHandler() {
		service=new LinkServiceImpl();
	}
	//handler method 1
	public String showMessage(HttpServletRequest req ) {
		//user service class
		String resultMssg=service.generateWishMessage();
		//keep result in request scope
		req.setAttribute("wmsg", resultMssg);
		//return logical view name (LVN) based which physical 
		//jsp file name and location will be decided 
		return "wish_result";
	}
	public String showAllLanguages(HttpServletRequest req) {
		//user service class
		Set<String>langSet=service.fetchAllLanguages();
		//keep result in request scope
		req.setAttribute("langinfo", langSet);
		//return LVN
		return "all_lang";
		}

}
