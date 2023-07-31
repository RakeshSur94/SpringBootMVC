package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.module.Employee;
import com.nt.module.EmployeeLeave;

public interface IEmployeeMgmtService {
	public String saveEmployeeDetails(Employee emp);
	public String saveEmployeeLeave(EmployeeLeave empLeave);
	public List<Employee> getAllEmployee();
	public List<Integer> getAllEmpId();
	public List<EmployeeLeave> getLeaveDetais();
	public Employee getEmployeeById(int id);
	public String deleteEmployeeByid(int id);
	public Boolean isDesgRejected(String desg);
	public Page<Employee> getAllEmployeeReportByPage(Pageable pageable);
	public String wishMessageGenerator(String user);
	public List<String> getAllEmpName();

	
	

}
