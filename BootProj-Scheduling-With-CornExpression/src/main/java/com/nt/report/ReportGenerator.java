package com.nt.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator {

	//@Scheduled(cron = ("15 * * * * *"))
	//@Scheduled(cron = ("* * 9 * * *"))
	//@Scheduled(cron = ("1 33 22 * * *"))
	//@Scheduled(cron = ("* * * * * *"))
	//@Scheduled(cron = ("1 36 8,22 * * *"))
	//@Scheduled(cron = ("15 20 9-14 * * *"))
	//@Scheduled(cron = ("* * *  * SAT-SUN"))
	@Scheduled(cron = ("0/10 * * * * *"))
	public void generateReport() {
		
		

		 System.out.println("Report Data on:: "+ new Date());
		
		
		
	}
	
	

}
