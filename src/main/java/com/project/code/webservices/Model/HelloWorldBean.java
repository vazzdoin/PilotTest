package com.project.code.webservices.Model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class HelloWorldBean {
	
	public String message;
	
	public HelloWorldBean(String string) {
		// TODO Auto-generated constructor stub
		this.message = string;
	}

}
