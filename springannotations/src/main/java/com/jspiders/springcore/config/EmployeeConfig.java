package com.jspiders.springcore.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcore.bean.EmployeeBean;

public class EmployeeConfig {
	
	@Bean
	public EmployeeBean getBean() {
		return new EmployeeBean();
	}

}
