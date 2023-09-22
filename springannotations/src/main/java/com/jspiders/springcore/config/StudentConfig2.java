package com.jspiders.springcore.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcore.bean.StudentBean2;

public class StudentConfig2 {
	
	@Bean("student2")
	public StudentBean2 getBean() {
		return new StudentBean2(1,"Abhijeet","abhijeet@gmail.com");
	}

}
