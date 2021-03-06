package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String getMessage(@RequestParam(value = "name") String name)
	{
		return "Hello" + name;
	}
	
	
	
	@GetMapping("/helloword")
	public String getMessage()
	{
		return "HelloWorld";
	}

}
