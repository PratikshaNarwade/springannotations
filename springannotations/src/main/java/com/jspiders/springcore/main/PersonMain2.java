package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.PersonBean2;
import com.jspiders.springcore.config.PersonAadharConfig2;

public class PersonMain2 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PersonAadharConfig2.class);
		PersonBean2 person = context.getBean(PersonBean2.class);
		System.out.println(person);

		((AnnotationConfigApplicationContext) context).close();
	}

}
