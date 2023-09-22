package com.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class PersonBean1 {

	@Value("100")
	private int id;
	@Value("Pratiksha")
	private String name;
	@Value("Pune")
	private String address;
	@Autowired
	private AadharBean1 aadhar;

}
