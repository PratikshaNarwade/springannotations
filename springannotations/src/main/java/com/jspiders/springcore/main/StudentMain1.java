package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.StudentBean1;
import com.jspiders.springcore.config.StudentConfig1;

public class StudentMain1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig1.class);
		StudentBean1 student = context.getBean(StudentBean1.class);
		System.out.println(student);
		((AnnotationConfigApplicationContext)context).close();
	}

}
