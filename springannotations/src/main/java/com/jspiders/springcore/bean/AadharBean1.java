package com.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AadharBean1 {
	
	@Value("1")
	private int id;
	@Value("12/12/2019")
	private String dateOfIssue;
	@Value("234567899345")
	private long aadharNumber;

}
