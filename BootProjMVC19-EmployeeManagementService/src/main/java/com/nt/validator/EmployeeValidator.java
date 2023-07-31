package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.module.Employee;
@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(Employee.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee emp=(Employee) target;
		if((emp.getEname().isBlank())||(emp.getEname()==null))
			errors.rejectValue("ename", "Name must not be null");
		else if(emp.getJob().isBlank())
			errors.rejectValue("job", "Job must not be null");
		if(emp.getEname().length()>12)
			errors.rejectValue("ename", "Name must be greater than 12 char");
		else if(emp.getJob().length()>10)
			errors.rejectValue("job", "Job must be greater than 10 char");
		if(emp.getSal()<=1000)
			errors.rejectValue("sal","Salary must be Greater than 1000");
		


	}

}
