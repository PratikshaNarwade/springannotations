package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.StudentBean2;
import com.jspiders.springcore.config.StudentConfig2;

public class StudentMain2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig2.class);
		StudentBean2 student = (StudentBean2)context.getBean("student2");
		System.out.println(student);
		((AnnotationConfigApplicationContext)context).close();
	}
	
	

}
