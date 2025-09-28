package com.flipkart.POrderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class POrderServiceApplication {

	public static void main(String[] args) {
	
		
	 ConfigurableApplicationContext context =  SpringApplication.run(POrderServiceApplication.class, args);
	 
	 DoTransaction card = context.getBean(DoTransaction.class);
	card.Dotransaction();
	
	
	 
	 
	}

}
