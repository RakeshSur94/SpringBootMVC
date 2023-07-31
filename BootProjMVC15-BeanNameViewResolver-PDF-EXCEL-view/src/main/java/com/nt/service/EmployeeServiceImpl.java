package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.module.Employee;
import com.nt.repository.IEmployeeRepository;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeServiceMgmt {
	@Autowired
	private IEmployeeRepository empRepo;
	

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}
	

}
