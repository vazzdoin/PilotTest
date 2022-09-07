package com.project.code.webservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.code.webservices.Model.HelloWorldBean;

@RestController
@RequestMapping("api/v1")
public class HelloWorldController {
	
	@GetMapping(path = "/helloworld")
	public String welcomeUser() {
		return "Hello World";
	}
	
	@GetMapping("/hellobean")
	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

}
