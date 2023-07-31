package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepository;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeRepository empRepo;

	@Override
	public String registerEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return "employee saved with empno "+empRepo.save(emp).getEmpno();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}
	@Override
	public String deleteEmployeeById(int id) {
	empRepo.deleteById(id);
		return id+"  no Employee is deleted ";
	}
	@Override
	public String updateEmployeeById(Employee emp) {
		// TODO Auto-generated method stub
		return "employee updated with no "+empRepo.save(emp).getEmpno();
	}
	@Override
	public Employee getEmployeeById(int no) {

			Employee emp=empRepo.findById(no).orElseThrow(() -> new IllegalArgumentException("Employee not found"));
			return emp;
	}
	@Override
	public Page<Employee> getEmployeeByPage(Pageable pageable) {
		Page<Employee>page=empRepo.findAll(pageable);
		return page;
	}

}
