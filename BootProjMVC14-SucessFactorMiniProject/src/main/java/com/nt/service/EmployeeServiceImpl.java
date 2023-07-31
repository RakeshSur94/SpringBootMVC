package com.nt.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.exception.EmployeeNotFoundException;
import com.nt.module.Employee;
import com.nt.module.EmployeeLeave;
import com.nt.repo.IEmployeeLeaveRepo;
import com.nt.repo.IEmployeeRepository;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeRepository empRepo;
	@Autowired
	private IEmployeeLeaveRepo empLeaveRepo;

	@Override
	public String saveEmployeeDetails(Employee emp) {

		return "Employee Saved with EMPID " + empRepo.save(emp).getEmpid();
	}

	@Override
	public String saveEmployeeLeave(EmployeeLeave empLeave) {
		// TODO Auto-generated method stub
		return "Employee Leave Saved With EMPID " + empLeaveRepo.save(empLeave).getEmpid();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public List<Integer> getAllEmpId() {
		// TODO Auto-generated method stub
		return empLeaveRepo.findEmpId();
	}
	

	@Override
	public List<EmployeeLeave> getLeaveDetais() {
		// TODO Auto-generated method stub
		return empLeaveRepo.findAll();
	}
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).orElseThrow(()-> new EmployeeNotFoundException("emp not found"));
	}
@Override
public List<String> getAllEmpName() {
	// TODO Auto-generated method stub
	return empRepo.getAllEmpName();
}
	

	@Override
	public String deleteEmployeeByid(int id) {

		empRepo.deleteById(id);
		return id + " employee deleted";
	}
	@Override
	public Boolean isDesgRejected(String desg) {
		if(desg.equalsIgnoreCase("TeamLeader"))
			return true;
		else
			return false;
		
	}
	@Override
	public Page<Employee> getAllEmployeeReportByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return empRepo.findAll(pageable);
	}
	
	@Override
	public String wishMessageGenerator(String user) {
		//get hour of current day
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour>4&&hour<=11)
			return "Good Morning "+user;
		else if(hour>11&&hour<=16)
			return "Good AfterNoon "+user;
		else if(hour>16&&hour<=21)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
		
	}
	
}