package com.nt.runner;

import java.util.Random;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class EmployeeBatchRunner implements CommandLineRunner {
	@Autowired
	private JobLauncher luncher;
	@Autowired
	private Job job;

	@Override
	public void run(String... args) throws Exception {
		/*// Create JobParameters
		JobParameters params=  new JobParametersBuilder().addLong("run.id",new Random().nextLong(1000)).toJobParameters();
		//run the job
		JobExecution excution= luncher.run(job, params);
		System.out.println("Job Completion status:: "+excution.getExitStatus());*/

	}

}
