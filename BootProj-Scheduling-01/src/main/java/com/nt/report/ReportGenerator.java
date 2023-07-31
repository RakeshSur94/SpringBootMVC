package com.nt.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator {
	@Scheduled(initialDelay = 4000,fixedDelay = 6000)
	//@Scheduled(fixedDelay = 3000)
	//@Scheduled()
     //@Scheduled(fixedDelayString = "3000")
	//@Scheduled(fixedRate  = 10000)
	//@Scheduled(initialDelay = 2000 , fixedDelay = 3000)
	public void generateReport1() {
		/*System.out.println("Start Generate Report on :: "+ new Date());
		try {
			Thread.sleep(15000);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("End of Generate Report on :: "+ new Date());
		*/
		/* System.out.println("thread(task1) name :: "+Thread.currentThread().getName());
		 System.out.println("thread(task1) name :: "+Thread.currentThread().hashCode());
		 System.out.println("Report Data1 on:: "+ new Date());*/
		
		
		
	}
	@Scheduled(initialDelay = 2000 , fixedDelay = 3000)
	public void generateReport2() {
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		 System.out.println("thread(task2) name :: "+Thread.currentThread().getName());
		 System.out.println("thread(task2) name :: "+Thread.currentThread().hashCode());
		 System.out.println("Report Data2 on:: "+ new Date());
		
		
		
	}
	
	

}
