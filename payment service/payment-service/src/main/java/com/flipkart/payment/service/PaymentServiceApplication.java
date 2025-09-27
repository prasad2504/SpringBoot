package com.flipkart.payment.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context =	SpringApplication.run(PaymentServiceApplication.class, args);
	 
	Animal animal = context.getBean(Animal.class);
	 Plants plants = context.getBean(Plants.class);
	 System.out.println("_____________________________");

	 
	 animal.Aisplay();
	 plants.Pisplay();
	 
	 System.out.println("_____________________________");
	 
	 String[] arr = context.getBeanDefinitionNames();
	 System.out.println(arr.length);
	 System.out.println("_____________________________");

	 for(String str:arr) {
		 System.out.println(str);
	 }
	 
	 System.out.println("_______________________");
	 
	 
	 int count = context.getBeanDefinitionCount();
	 System.out.println(count);
	 
	 System.out.println("_____________________________");

	 
	 
	}

}
