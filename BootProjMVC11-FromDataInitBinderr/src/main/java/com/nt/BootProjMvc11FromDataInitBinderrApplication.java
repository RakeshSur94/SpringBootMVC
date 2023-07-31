package com.nt;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootProjMvc11FromDataInitBinderrApplication {
	private static Logger logger= LogManager.getLogger(BootProjMvc11FromDataInitBinderrApplication.class);
	
	

	public static void main(String[] args) {
		SpringApplication.run(BootProjMvc11FromDataInitBinderrApplication.class, args);
		logger.debug("Main Method");
		
		
	}

}
