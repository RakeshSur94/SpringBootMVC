package com.nt.interceptor;

import java.time.LocalDateTime;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TimeCheckerInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		System.out.println("TimeCheckerInterceptor.preHandle()");
		if(req.getServletPath().equalsIgnoreCase("/"))
			return true;
		
		LocalDateTime ldt= LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour>9) {
			return true;
			
		}	
		RequestDispatcher rd= req.getRequestDispatcher("/timeout.jsp");
		rd.forward(req, res);
		return false;
		
		
		
		
		
			
	}
	
	
	
	

}
