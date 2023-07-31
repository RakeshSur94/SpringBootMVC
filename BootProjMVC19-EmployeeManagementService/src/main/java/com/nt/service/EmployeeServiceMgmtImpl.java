package com.nt.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.module.Employee;
import com.nt.repository.IEmployeeRepository;

@Service("empService")
public class EmployeeServiceMgmtImpl implements IEmployeeServiceMgmt {
	@Autowired
	private IEmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployee() {

		return empRepo.findAll();
	}

	@Override
	public String registerNewEmployee(Employee emp) {

		return "Employee Save With EMPNO" + empRepo.save(emp).getEmpno();
	}

	@Override
	public Employee getEmployeeById(int id) {

		return empRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee Not Found"));
	}

	@Override
	public String deleteById(int id) {
		Optional<Employee> opt = empRepo.findById(id);
		if (opt.isPresent()) {
			empRepo.deleteById(id);
		}

		return "Employee not found";

	}
	@Override
	public String wishMessage(String user) {
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour>4&&hour<=11)
			return "GOOD MORNING "+user;
		else if(hour>11&&hour<=17)
			return "GOOD AFTERNOON "+user;
		else if(hour>17&&hour<=22)
			return "GOOD EVENING "+user;
		else
			return "GOOD NIGHT "+user;
	
	}
	@Override
	public Page<Employee> getAllEmployeePageByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return empRepo.findAll(pageable);
	}


}
