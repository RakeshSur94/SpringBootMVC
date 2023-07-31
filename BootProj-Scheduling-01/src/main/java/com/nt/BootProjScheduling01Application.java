package com.nt;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BootProjScheduling01Application {

	public static void main(String[] args) {
		SpringApplication.run(BootProjScheduling01Application.class, args);
		System.out.println(Thread.currentThread().getName()+" App started at "+ new Date());
	}

}
