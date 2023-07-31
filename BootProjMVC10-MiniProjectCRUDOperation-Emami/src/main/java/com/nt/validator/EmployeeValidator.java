package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.Emami;

@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.isAssignableFrom(Emami.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//type casting with model class
		Emami emp=(Emami) target;
		//Form validation logic (server side) and place the errors in errors object
		if(emp.getName()==null ||emp.getName().isBlank())//required rule
			errors.rejectValue("name", "emp.name.required");
		else if(emp.getName().length()<5||emp.getName().length()>15)//length rule
			errors.rejectValue("name", "emp.name.length");
		 if(emp.getDesg()==null ||emp.getDesg().isBlank())//required rule
			errors.rejectValue("desg", "emp.desg.required");
		 else if(emp.getDesg().length()<5||emp.getDesg().length()>15)//length rule
				errors.rejectValue("desg", "emp.desg.length");
		 if(emp.getSal()==null)
			 errors.reject("sal", "emp.salary.required");
		 else if(emp.getSal()<1000||emp.getSal()>5000)
			 errors.rejectValue("sal", "emp.salary.range");
		 if(emp.getStatus()==null||emp.getStatus().isBlank())
			 errors.reject("status", "emp.status.required");

	}

}
