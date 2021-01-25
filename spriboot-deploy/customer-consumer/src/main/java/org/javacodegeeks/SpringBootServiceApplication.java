package org.javacodegeeks;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import org.javacodegeeks.controllers.ServiceClient;

@SpringBootApplication
public class SpringBootServiceApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				SpringBootServiceApplication.class, args);
		
		ServiceClient serviceClient=ctx.getBean(ServiceClient.class);
		System.out.println(serviceClient);
		serviceClient.getCustomer();
		
	}
	
	@Bean
	public  ServiceClient  serviceClient()
	{
		return  new ServiceClient();
	}
}