package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /* Annotation Spring: Indica ao Spring que é uma classe controladora */ 
@RequestMapping ("/hello") /*End point: criado com ("/NomedoEndPoint)*/
public class HelloController {
	@GetMapping 
	public String hello () {
		return "Hello World!";
	
	}
	
}
