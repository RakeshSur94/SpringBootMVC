package com.nt.listner;

import java.util.Date;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class JobMonitoringListner implements JobExecutionListener{
  private long startTime,endTime;
	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("Job Started at "+new Date());
		startTime=System.currentTimeMillis();
		System.out.println("job status is : "+jobExecution.getStatus());
	
	}
	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("Job Completed at "+new Date());
		endTime=System.currentTimeMillis();
		System.out.println("Total time taken for job  is : "+(startTime-endTime)+"  ms");
		System.out.println("job Completion  status is : "+jobExecution.getStatus());
		
	}
	

}
