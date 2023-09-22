package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.PersonBean1;
import com.jspiders.springcore.config.PersonAadharConfig1;

public class PersonMain1 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PersonAadharConfig1.class);
		PersonBean1 person = context.getBean(PersonBean1.class);
		System.out.println(person);

		((AnnotationConfigApplicationContext) context).close();
	}

}
