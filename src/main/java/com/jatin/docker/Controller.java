package com.jatin.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String hello() {
		return "hello this is java application...........!";
	}
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "hello this is java application with Docker file...........!";
	}

}
