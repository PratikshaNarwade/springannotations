package com.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class PersonBean2 {

	private int id;
	private String name;
	private AadharBean2 aadhar;

	@Autowired
	public PersonBean2(int id, String name,String address, AadharBean2 aadhar) {
		this.id = id;
		this.name = name;
		this.aadhar = aadhar;
	}

}
