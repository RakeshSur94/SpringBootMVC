package com.nt.module;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="EMPLOYEE_EMAMI")
@Entity
public class Employee implements Serializable{

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	@Column(name = "FIRST_NAME", length = 20)
	private String firstName;
	@Column(name = "LAST_NAME", length = 20)
	private String  lastName;
	@Column(name = "EMAIL")
	private String email;
	
	
}
