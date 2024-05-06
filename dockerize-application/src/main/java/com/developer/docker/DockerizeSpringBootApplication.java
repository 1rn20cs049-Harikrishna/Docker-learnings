package com.developer.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerizeSpringBootApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Hi from spring boot application";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerizeSpringBootApplication.class, args);
	}

}
