package com.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class EmployeeBean {
	
	@Value("1")
	private int id;
	@Value("Abhishek")
	private String name;
	@Value("abhishek21@gmail.com")
	private String email;
	@Value("35000.00")
	private double salary;

}
