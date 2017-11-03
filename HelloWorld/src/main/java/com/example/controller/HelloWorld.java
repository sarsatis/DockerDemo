package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	public String sayHello() {
		return "hello";
	}

}
