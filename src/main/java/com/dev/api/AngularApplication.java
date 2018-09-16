package com.dev.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.dev.api")
public class AngularApplication {
	public static void main(String[] args) {
		SpringApplication.run(AngularApplication.class, args);
	}
}
