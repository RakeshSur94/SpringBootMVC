package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.module.EmployeeInfo;

public interface IEmployeeInfoRepository extends JpaRepository<EmployeeInfo, Integer>{

}
