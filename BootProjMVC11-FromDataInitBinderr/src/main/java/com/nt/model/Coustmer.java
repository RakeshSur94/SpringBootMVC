package com.nt.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import lombok.Data;

@Data
public class Coustmer {
	
	private Integer cid;
	private String cname;
	private Date dob;
	private LocalDate doj;
	private LocalTime tob;
	private LocalDateTime dop=LocalDateTime.now();
}
