package com.nt.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nt.module.EmployeeInfo;
import com.nt.repository.IEmployeeInfoRepository;
import com.nt.service.IEmployeeService;


@SpringBootTest
public class EmployeeRepoTest {
	
	
	@Autowired
	private IEmployeeService service;
	
	private static EmployeeInfo einfo;
	@BeforeAll
	public  static void setUpOnce() {
		einfo=new EmployeeInfo();
	}
	@AfterAll
	public  static void clearOnce(EmployeeInfo einfo) {
		einfo=null;
	}
	
	@Test
	public void isPersonExistedById() {
		einfo.setDeptno(10);
		einfo.setEmpno(2);
		einfo.setJob("peon");
		einfo.setEname("raka");
		einfo.setSal(4521.0);
		service.registerEmployee(einfo);
	
		
	  
		assertEquals(einfo,service.getEmployeeByNo(2));
		
		
	}
		
}
