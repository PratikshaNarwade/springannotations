package com.jspiders.springcore.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcore.bean.StudentBean1;

public class StudentConfig1 {
	
	@Bean
	public StudentBean1 getBean() {
		StudentBean1 student = new StudentBean1();
		student.setId(1);
		student.setName("Pratiksha");
		student.setEmail("pratiksha@gmail.com");
		return student;
		
	}

}
