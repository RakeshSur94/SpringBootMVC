package com.nt.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class BrowserChekingInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		System.out.println("BrowserChekingInterceptor.preHandle()");
		/*if(req.getServletPath().equalsIgnoreCase("/"))
			return true;
		//get browser
		String browser=req.getHeader("user-agent");
		if(browser.contains("Edge")) {
			RequestDispatcher rd= req.getRequestDispatcher("/timeout.jsp");
			rd.forward(req, res);
			return false;
		}*/
		return true;
	}

}
