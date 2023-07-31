package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.module.Employee;

public interface IEmployeeServiceMgmt {
	public List<Employee> getAllEmployee();
	public String registerNewEmployee(Employee emp);
	public Employee getEmployeeById(int id);
	public String deleteById(int id);
	public String wishMessage(String user);
	public Page<Employee> getAllEmployeePageByPage(Pageable pageable);
	

}
