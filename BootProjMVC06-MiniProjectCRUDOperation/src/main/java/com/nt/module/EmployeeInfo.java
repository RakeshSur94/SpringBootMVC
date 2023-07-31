package com.nt.module;

import java.io.Serializable;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

/*@SQLDelete(sql = "UPDATE EMP SET STATUS='deleted' WHERE EMPNO=?")
@Where(clause = "STATUS <> 'deleted' ")*/
@Table(name = "emp")
@Entity
@Data
public class EmployeeInfo implements Serializable {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "e_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer empno;
	@Column(length = 30)
	private String ename;
	private String job;
	private Double sal;
	private Integer deptno;
		@Transient
		private String status="active";
		@Transient
		private String vflag="no";

}
