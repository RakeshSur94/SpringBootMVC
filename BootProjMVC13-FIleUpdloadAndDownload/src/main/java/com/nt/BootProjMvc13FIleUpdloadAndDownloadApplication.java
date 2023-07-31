package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

@SpringBootApplication
public class BootProjMvc13FIleUpdloadAndDownloadApplication {
	
	@Bean(name = "multipartResolver")//fixed bean id
	public StandardServletMultipartResolver createSSMR() {
		StandardServletMultipartResolver ssmr=new StandardServletMultipartResolver();
		return ssmr;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(BootProjMvc13FIleUpdloadAndDownloadApplication.class, args);
	}

}
