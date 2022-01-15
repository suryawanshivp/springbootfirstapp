package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HelloWorldController {
	
	//GET HTTP method
	//http://localhost:8090/hello-world
	@GetMapping("/hello-world") 
	public String helloworld() {
		return "Hello Simplilearn...Welcome to Bookzy...welcome again!";
	}

}
