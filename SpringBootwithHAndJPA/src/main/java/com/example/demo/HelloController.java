package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {


	@GetMapping("/hello")
	public String getMessage(@RequestParam(value = "name") String name)
	{
	return "Hello  " ;
	//countryrepository.findById(1);
		
		
	}

}
