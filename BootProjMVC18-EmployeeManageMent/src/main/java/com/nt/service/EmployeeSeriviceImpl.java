package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.module.Employee;
import com.nt.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeSeriviceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public String saveEmployee(Employee emp) {
	
		return "Employee save With ID "+ empRepo.save(emp).getId();
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		
		return empRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee Not Found"));
	}

	@Override
	public String deleteEmpoyeeById(long id) {
		empRepo.deleteById(id);
		return id+" no is deleted" ;
	}

	@Override
	public Page<Employee> getAllEmployeeBypage(Pageable pageable) {
		
		return empRepo.findAll(pageable);
	}

}
