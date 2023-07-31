package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.module.Employee;

public interface IEmployeeService {
	public String saveEmployee(Employee emp);
    public List<Employee> getEmployee();
    public Employee getEmployeeById(long id);
    public String deleteEmpoyeeById(long id);
    public Page<Employee> getAllEmployeeBypage(Pageable pageable);
}
