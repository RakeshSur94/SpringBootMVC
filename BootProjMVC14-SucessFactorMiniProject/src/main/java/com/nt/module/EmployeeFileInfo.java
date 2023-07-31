package com.nt.module;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class EmployeeFileInfo {
	private Integer empid;
	private String name;
	private MultipartFile imageFile;
	private MultipartFile document;
	

}
