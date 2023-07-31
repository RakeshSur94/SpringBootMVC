package com.nt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.module.Department;
import com.nt.module.EmployeeInfo;
import com.nt.repository.IDepartmentRepository;
import com.nt.repository.IEmployeeInfoRepository;

@Service("eService")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeInfoRepository eRepo;
	@Autowired
	private IDepartmentRepository dRepo;

	@Override
	public List<EmployeeInfo> getEmployee() {
		List<EmployeeInfo>list=eRepo.findAll();
		return list;
	}
	@Override
	public String registerEmployee(EmployeeInfo emp) {
		// TODO Auto-generated method stub
		return "Employee saved with id "+eRepo.save(emp).getEmpno();
	}
	@Override
	public EmployeeInfo getEmployeeByEmpNo(int empno) {
		EmployeeInfo info=eRepo.findById(empno).orElseThrow(() -> new IllegalArgumentException("Employee not found"));
		return info;
	}
	@Override
	public String updateEmployee(EmployeeInfo emp) {
		// TODO Auto-generated method stub
		return "Employee information updated with id "+eRepo.save(emp).getEmpno();
	}
	@Override
	public String removeEmployeeByNo(int no) {
		// TODO Auto-generated method stub
		eRepo.deleteById(no);
		return no+ "  Employee is removed";
	}
	@Override
	public List<Integer> fetchAllDepartment() {
		List<Integer>list= dRepo.getAllDeptNO();
		return list;
	}
	@Override
	public Boolean isDesignRejectList(String desg) {
		if(desg.equalsIgnoreCase("TL"))
			return true;
		else
		return false;
	}
	@Override
	public Page<EmployeeInfo> getEmployeeDataByPage(Pageable pageable) {
		
		return eRepo.findAll(pageable);
	}
	@Override
	public String getEmployeeByNo(int no) {
		// TODO Auto-generated method stub
		return no+"Employee found "+eRepo.findById(no);
	}

}
