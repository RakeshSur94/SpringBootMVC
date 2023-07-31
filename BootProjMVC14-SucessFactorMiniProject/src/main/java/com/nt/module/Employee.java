package com.nt.module;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.Where;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Entity
@Table(name="SUCESSFACTOR_EMP" )
/*@SQLDelete(sql = "UPDATE SUCESSFACTOR_EMP SET status='delete' where empid=?")
@Where(clause ="status<>'delete'")*/
public class Employee implements Serializable {
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "SUCESS_SEQ",initialValue = 500,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer empid;
	
	@Column(length = 20)
	private String name;
	
	private LocalDateTime doj=LocalDateTime.now();
	@Column(length = 20)
	private String desg;
	private Float sal;
	
	private String status="active";
	@Column(length = 200)
	private String photoPath;
	@Column(length = 200)
	private String documentPath;
	

}
