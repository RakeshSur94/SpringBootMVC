package com.nt.module;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "SUCESSFACTOR_LEAVE")
public class EmployeeLeave implements Serializable {
	@Id
	private Integer empid;
	private Integer empALP;
	@CreationTimestamp
	@Column(name = "LEAVE_TAKEN_ON")
	private LocalDate leaveTakenDate;
	@UpdateTimestamp
	@Column(name = "LEAVE_END_ON")
	private LocalDate leaveEndDate;
	private Integer totalDayOfLeave;
	
	


}
