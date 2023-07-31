package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.model.Emami;

public interface IEmamiServiceMgmt {
	public String registerEmployee(Emami emp);
	public List<Emami> getAllEmployee();
	public Page<Emami> getAllPage(Pageable pageable);
	public String updateEmployee(Emami emp);
	public String removeEmployeeById(int id);
	public String employeeExistById(int no);
	
	


}
