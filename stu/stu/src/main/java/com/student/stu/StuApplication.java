package com.student.stu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StuApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuApplication.class, args);
	}

}
