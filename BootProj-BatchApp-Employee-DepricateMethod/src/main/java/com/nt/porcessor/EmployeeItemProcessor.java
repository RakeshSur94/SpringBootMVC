package com.nt.porcessor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;

@Component
public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee emp) throws Exception {
		if(emp.getSalary()>=10000) {
			emp.setGrossSalary(emp.getSalary()+emp.getSalary()*0.4f);
			emp.setNetSalary(emp.getGrossSalary()-emp.getGrossSalary()*0.2f);
		}
		return null;
	}

}
