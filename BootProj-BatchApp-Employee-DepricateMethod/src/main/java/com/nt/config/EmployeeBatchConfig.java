package com.nt.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import com.nt.listner.JobMonitoringListner;
import com.nt.model.Employee;

import com.nt.porcessor.EmployeeItemProcessor;

@Configuration
@EnableBatchProcessing
public class EmployeeBatchConfig {

	@Autowired
	private StepBuilderFactory stepFactory;
	@Autowired
	private JobBuilderFactory jobFactory;
	@Autowired
	private DataSource ds;
	@Autowired
	private EmployeeItemProcessor processor;
	@Autowired
	private JobMonitoringListner listner;

	@Bean
	public FlatFileItemReader<Employee> createFFIR() {
		// create FlatFileReader object
		FlatFileItemReader<Employee> reader = new FlatFileItemReader<Employee>();
		// set csv file as source
		reader.setResource(new ClassPathResource("Employee.csv"));
		// create LineMapper object to get each line from csv file
		DefaultLineMapper<Employee> lineMapper = new DefaultLineMapper<Employee>();
		// create Line tokenizer to Get tokens from lineszer to get
		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
		tokenizer.setDelimiter(",");
		tokenizer.setNames("empno", "ename", "eadd", "salary");
		// create FiledSetMapper to set the tokens to model class object properties
		BeanWrapperFieldSetMapper<Employee> fieldSetmapper = new BeanWrapperFieldSetMapper<Employee>();
		fieldSetmapper.setTargetType(Employee.class);
		// set tokenizer and fieldsetMapper to lineMapper
		lineMapper.setFieldSetMapper(fieldSetmapper);
		lineMapper.setLineTokenizer(tokenizer);
		// set lineMapper to reader object
		reader.setLineMapper(lineMapper);
		return reader;
	}

	@Bean
	public JdbcBatchItemWriter<Employee> createJBIW() {
		// create JdbcBatchItemWriter object
		JdbcBatchItemWriter<Employee> writer = new JdbcBatchItemWriter<Employee>();
		// set datasource
		writer.setDataSource(ds);
		// set Insert query with named params
		writer.setSql("INSERT INTO BATCH_EMPLOYEE VALUES(:empno,:ename,:eadd,:salary,:grossSalary,:netSalary)");
		// create BeanPropertiesItemSqlParameterSourceProvider Object
		BeanPropertyItemSqlParameterSourceProvider<Employee> sourceProvider = new BeanPropertyItemSqlParameterSourceProvider<Employee>();
		// set sourceProvider to writer object
		writer.setItemSqlParameterSourceProvider(sourceProvider);
		return writer;
	}
	//create step
	@Bean("step1")
	public Step createStep1() {
		return stepFactory.get("step1").<Employee,Employee>chunk(10)				                                                                                                            
				                                                                                                             .reader(createFFIR())
				                                                                                                             .writer(createJBIW())
				                                                                                                             .processor(processor)
				                                                                                                             .build();
		
	}
	@Bean("job1")
	public Job createJob1() {
		return jobFactory.get("job1").listener(listner)
				                                                                           .incrementer(new RunIdIncrementer())
				                                                                           .start(createStep1())
				                                                                           .build();
	}

}
