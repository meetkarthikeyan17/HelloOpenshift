package com.basant.spring.cloud.foundry.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudFoundryApplication {
	
	@GetMapping("/Welcome to First Openshift Platform")
	public String greetingMessage() {
		return "Waoo! Congrats karthik your application deployed successfully in Pivotal Cloud Foundry ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFoundryApplication.class, args);
	}
}
