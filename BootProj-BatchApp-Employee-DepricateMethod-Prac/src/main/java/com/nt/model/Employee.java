package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	
	private Integer id;
	private String name;
	private String address;
	private Float salary;
	private Float grossSalary;
	private Float netSalary;

}
