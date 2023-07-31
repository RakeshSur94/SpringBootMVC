package com.nt.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "emp")
@Data
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer empno;
	@Column(length = 20)
	private String ename;
	@Column(length = 20)
	private String job;
	private Double sal;
	private Integer deptno;

}
