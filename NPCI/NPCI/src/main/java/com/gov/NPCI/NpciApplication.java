package com.gov.NPCI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class NpciApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(NpciApplication.class, args);
	}

}
