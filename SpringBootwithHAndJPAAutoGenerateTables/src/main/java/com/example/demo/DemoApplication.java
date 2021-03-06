package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableAutoConfiguration

@SpringBootApplication

/**
 * 
 * @author admin
 * 
@ComponentScan("com.example.demo")
   @EnableJpaRepositories("com.example.demo")
   @EntityScan("com.example.demo")
   
   These Annotation are optoins but if your project wont work try with them 
 *
 */

@EntityScan("com.example.demo")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}
