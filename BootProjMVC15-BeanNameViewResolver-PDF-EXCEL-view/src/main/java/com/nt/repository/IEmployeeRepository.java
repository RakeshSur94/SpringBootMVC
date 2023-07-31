package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.module.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
