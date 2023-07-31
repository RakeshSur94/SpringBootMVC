package com.nt.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.nt.listner.JobMonitoringListner;
import com.nt.model.Employee;
import com.nt.porcessor.EmployeeJobProcessor;

@EnableBatchProcessing
@Configuration
public class BatchConfig {
	@Autowired
	private JobBuilderFactory jobFactory;
	@Autowired
	private StepBuilderFactory stepFactory;
	@Autowired
	private DataSource ds;
	@Autowired
	private JobMonitoringListner listner;
	@Autowired
	private EmployeeJobProcessor processor;
	
	@Bean(name="ffiReader")
	public FlatFileItemReader<Employee> createFFIR(){
		return new FlatFileItemReaderBuilder<Employee>()
			                                                                  	.name("file-reader")
				                                                                 .resource(new ClassPathResource("Employee.csv"))
				                                                                 .delimited()
				                                                                 .names("id","name","address","salary")
				                                                                 .targetType(Employee.class)
				                                                                 .build();
	}
	
	@Bean(name="jbiWriter")
	public JdbcBatchItemWriter<Employee> createJBIW(){
		return  new JdbcBatchItemWriterBuilder<Employee>()
				                                                                     .dataSource(ds)
				                                                                     .sql("INSERT INTO EMP_BATCH(id,name,address,salary,grossSalary,netSalary)VALUES(:id,:name,:address,:salary,:grossSalary,:netSalary)")
				                                                                     .beanMapped()
				                                                                     .build();
				                                                                     
	}
	
	@Bean(name="step1")
	public Step createStep1() {
		return stepFactory.get("step1")
				                                                 .<Employee,Employee> chunk(10)
				                                                  .reader(createFFIR())
				                                                  .processor(processor)
				                                                  .writer(createJBIW())
				                                                  .build();
	}
	
	@Bean(name="job1")
	public Job createJob1() {
		return jobFactory.get("job1")
				                                             .listener(listner)
				                                             .incrementer(new RunIdIncrementer())
				                                             .start(createStep1())
				                                             .build();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
