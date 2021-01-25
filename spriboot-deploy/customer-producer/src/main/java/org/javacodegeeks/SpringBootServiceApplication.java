package org.javacodegeeks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.javacodegeeks.controllers.ServiceController;

@SpringBootApplication
public class SpringBootServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiceApplication.class, args);
	}
}