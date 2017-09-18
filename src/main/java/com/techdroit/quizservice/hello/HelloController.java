package com.techdroit.quizservice.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value= {"/hello"})
	public String sayHello() {
		
		return "Hello User! Welcome to my REST service for my quiz app";
	}
}