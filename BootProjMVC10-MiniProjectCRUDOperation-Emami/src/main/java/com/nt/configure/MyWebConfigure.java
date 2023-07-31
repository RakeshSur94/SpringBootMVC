package com.nt.configure;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.nt.interceptor.BrowserChekingInterceptor;

@Component
public class MyWebConfigure implements WebMvcConfigurer {
	
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("MyWebConfigure.addInterceptors()");
		registry.addInterceptor(new BrowserChekingInterceptor());
	}

}
