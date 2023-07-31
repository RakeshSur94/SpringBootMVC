package com.nt.listner;

import java.util.Date;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;


@Component
public class JobMonitoringListner implements JobExecutionListener {
	private Long start,end;

	@Override
	public void beforeJob(JobExecution jobExecution) {
		start=System.currentTimeMillis();
		System.out.println("Job Started at :: "+new Date());
		

	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		end=System.currentTimeMillis();
		System.out.println("Job Completed at :: "+new Date());
		System.out.println("Total Time Taken for Execution of Job:: "+(start-end));
		System.out.println("Job Complition status:: "+jobExecution.getExitStatus());

	}

}
