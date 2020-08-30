package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Component
@RestController
public class TestCOntroller {
	@GetMapping("/test")
	public String hello()
	{
		return "Test";
		
	}

}
