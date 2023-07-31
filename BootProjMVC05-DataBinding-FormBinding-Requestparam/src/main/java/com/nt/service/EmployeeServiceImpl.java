package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.module.Employee;
import com.nt.repository.IEmployeeEmamiRepository;

@Service("eService")
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeEmamiRepository eRepo;

	@Override
	public String registerEmployee(Employee emp) {
	return "Employee registration completed with id "+eRepo.save(emp).getId();
	}

}
