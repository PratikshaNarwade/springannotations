package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.EmployeeBean;
import com.jspiders.springcore.config.EmployeeConfig;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employee = context.getBean(EmployeeBean.class);
		System.out.println(employee);
		((AnnotationConfigApplicationContext)context).close();
	}

}
