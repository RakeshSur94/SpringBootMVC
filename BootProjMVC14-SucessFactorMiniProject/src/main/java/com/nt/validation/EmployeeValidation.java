package com.nt.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.module.Employee;

@Component
public class EmployeeValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.isAssignableFrom(Employee.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee emp=(Employee) target;
		if(emp.getName()==null||emp.getName().isBlank())
			errors.rejectValue("name", "spring.name.required");
		else if(emp.getDoj()==null)
			errors.rejectValue("doj", "spring.doj.required");
		else if(emp.getDesg()==null||emp.getDesg().isBlank())
			errors.rejectValue("desg", "spring.desg.required");
		else if(emp.getSal()==null)
			errors.rejectValue("sal","spring.sal.required");
		
		if(emp.getName().length()>15)
			errors.rejectValue("name", "spring.name.length");
		else if(emp.getDesg().length()<4||emp.getDesg().length()>10)
			errors.rejectValue("name", "spring.desg.length");
		if(emp.getSal()<1000||emp.getSal()>10000)
			errors.rejectValue("sal", "spring.sal.range");

	}

}
