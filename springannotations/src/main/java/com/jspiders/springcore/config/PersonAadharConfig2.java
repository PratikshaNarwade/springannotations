package com.jspiders.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspiders.springcore.bean.AadharBean2;

@ComponentScan(basePackages = "com.jspiders.springcore")
public class PersonAadharConfig2 {

	@Bean
	public int getId() {
		return 1;
	}

	@Bean
	public String getName() {
		return "Abhishek";
	}
	
	@Bean
	public AadharBean2 getAadhar() {
		return new AadharBean2(1,"12/05/2009",123454328496L);
	}

}
