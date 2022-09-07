package com.project.code.webservices.controller;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.code.webservices.Model.HelloWorldBean;

@RestController
@RequestMapping("api/v1")
public class HelloWorldController {
private MessageSource messageSource;

	private MessageSource messSource;

	public HelloWorldController(MessageSource messageSource) {
		this.messageSource =  messageSource;
	}
	
	@GetMapping(path = "/helloworld")
	public String welcomeUser() {
		return "Hello World";
	}
	
	@GetMapping("/hellobean")
	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping("/welcome")
	public String helloWorld() {
		Locale local = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default", local);
	}

}
