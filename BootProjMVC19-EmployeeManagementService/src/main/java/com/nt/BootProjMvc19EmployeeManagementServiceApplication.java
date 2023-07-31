package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class BootProjMvc19EmployeeManagementServiceApplication {

	public static void main(String[] args) {
		log.trace("Application is started");
		SpringApplication.run(BootProjMvc19EmployeeManagementServiceApplication.class, args);
		log.debug("Main-Method is Started");
	}

}
