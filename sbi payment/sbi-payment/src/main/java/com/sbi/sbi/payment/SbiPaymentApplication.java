package com.sbi.sbi.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbiPaymentApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = 	SpringApplication.run(SbiPaymentApplication.class, args);
	 
	 DoTransaction transaction = context.getBean(DoTransaction.class);
	 transaction.CompleteTrasaction();
	
	}

}
