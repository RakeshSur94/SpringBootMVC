package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	public String registerEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public String deleteEmployeeById(int id);
	public String updateEmployeeById(Employee emp);
	public Employee getEmployeeById(int no);
	public Page<Employee> getEmployeeByPage(Pageable pageable);

}
