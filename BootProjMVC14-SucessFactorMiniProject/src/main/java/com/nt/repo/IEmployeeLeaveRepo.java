package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import com.nt.module.EmployeeLeave;

import jakarta.transaction.Transactional;

public interface IEmployeeLeaveRepo extends JpaRepository<EmployeeLeave, Integer> {
	
	
	@Query("SELECT empid FROM EmployeeLeave")
	public List<Integer> findEmpId();



}
