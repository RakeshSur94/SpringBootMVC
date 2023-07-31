package com.nt.module;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;

@Table(name = "EMPLOYEE_EMAMI")
@Entity
@Data
public class Employee  implements Serializable{
	
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "EMAMI_SEQ",initialValue = 100,allocationSize = 5)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(length = 20)
	@NonNull
	private String name;
	@Column(length = 20)
	@NonNull
	private String username;
	@Column(length = 40)
	@NonNull
	private String email;
	@Column(length = 10)
	@NonNull
	private String password;
	@Column(length = 10)
	@NonNull
	private String conformpassword;
	@Column(length = 200)
	@NonNull
	private String message;

}
