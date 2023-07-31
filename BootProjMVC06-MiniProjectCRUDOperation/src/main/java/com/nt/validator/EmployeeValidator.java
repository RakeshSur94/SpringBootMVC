package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.module.EmployeeInfo;

@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {//to check weather current model class is taken or not
		
		return clazz.isAssignableFrom(EmployeeInfo.class);//if true next validation(-) method executes
		                                                                                               //otherwise validate(-) method does'not execute
	}

	@Override
	public void validate(Object target, Errors errors) {// place the form validation logic here
		
		//type casting with model class
		EmployeeInfo emp= (EmployeeInfo) target;
		//Form validation logic (server side) and place the errors in errors object
		if(emp.getEname()==null || emp.getEname().isBlank())// required rule
			errors.rejectValue("ename", "emp.name.required");
		else if(emp.getEname().length()<5||emp.getEname().length()>=15) //length rule
			errors.rejectValue("ename", "emp.name.length");
			
		if(emp.getJob()==null || emp.getJob().isBlank())// required rule
			errors.rejectValue("ename", "emp.job.required");
		else if(emp.getJob().length()<5||emp.getJob().length()>=10) //length rule
			errors.rejectValue("job", "emp.job.length");
		
		if(emp.getSal()==0.0)  //required rule
			errors.rejectValue("sal", "emp.salary.range");//range rule
		else if(emp.getSal()<1000|| emp.getSal()>200000)//range rule
			errors.rejectValue("sal", "emp.salary.range");
		
		if(emp.getDeptno()==null)
			errors.rejectValue("deptno","emp.deptno.required");
		
		/*	if(!errors.hasFieldErrors("sal")) {
				
				if(emp.getSal()==0) 
					errors.rejectValue("sal","emp.salary.required");
				else if(emp.getSal()<1000.0||emp.getSal()>200000.0)
					errors.rejectValue("sal", "emp.salary.range");
			}*/
		
		
		

	}

}
