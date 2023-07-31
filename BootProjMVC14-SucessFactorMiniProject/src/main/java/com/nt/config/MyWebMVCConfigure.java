package com.nt.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.nt.interceptor.TimeCheckerInterceptor;

@Component
public class MyWebMVCConfigure implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("MyWebMVCConfigure.addInterceptors()");
	registry.addInterceptor(new TimeCheckerInterceptor());
	}

}
