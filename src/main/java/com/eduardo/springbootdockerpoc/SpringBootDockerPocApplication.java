package com.eduardo.springbootdockerpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootDockerPocApplication {

	@GetMapping("/hello-world")
	public String testRequest() {

		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerPocApplication.class, args);
	}

}
