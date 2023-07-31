package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.model.Emami;
import com.nt.repository.IEmamiRepository;

@Service("eService")
public class EmamiServiceMgmtImpl implements IEmamiServiceMgmt {
	@Autowired
	private IEmamiRepository emamiRepo;

	@Override
	public String registerEmployee(Emami emp) {
		// TODO Auto-generated method stub
		return "Employee Saved with id no "+emamiRepo.save(emp).getId();
	}
	@Override
	public List<Emami> getAllEmployee() {
		// TODO Auto-generated method stub
		return emamiRepo.findAll();
	}
	@Override
	public Page<Emami> getAllPage(Pageable pageable) {
		Page<Emami>page=emamiRepo.findAll(pageable);
		return page;
	}

	@Override
	public String updateEmployee(Emami emp) {
		// TODO Auto-generated method stub
		return "Employee Saved with Id "+emamiRepo.save(emp).getId();
	}
	@Override
	public String removeEmployeeById(int id) {
		emamiRepo.deleteById(id);
		return id+" id Employee removed ";
	}
	@Override
	public String employeeExistById(int no) {
		// TODO Auto-generated method stub
		return "Existed "+emamiRepo.findById(no);
	}
	
}
