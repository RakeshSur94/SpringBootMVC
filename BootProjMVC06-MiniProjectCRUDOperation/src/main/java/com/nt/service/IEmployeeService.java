package com.nt.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.module.Department;
import com.nt.module.EmployeeInfo;

public interface IEmployeeService {
	public List<EmployeeInfo> getEmployee();
	public String registerEmployee(EmployeeInfo emp);
	public EmployeeInfo getEmployeeByEmpNo(int empno);
	public String updateEmployee(EmployeeInfo emp);
	public String removeEmployeeByNo(int no);
	public List<Integer> fetchAllDepartment();
	public Boolean isDesignRejectList(String desg);
	public Page<EmployeeInfo> getEmployeeDataByPage(Pageable pageable);
	public String getEmployeeByNo(int no);
	

}
