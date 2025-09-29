package com.icici.mobikwik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.icici.mobikwik.component.Prototype;
import com.icici.mobikwik.component.Singleton;

@SpringBootApplication
public class TransactionServiceApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext con = 	SpringApplication.run(TransactionServiceApplication.class, args);
	
//	System.out.println("Application started");
	
//	System.out.println("____________________________________");
//	Singleton single1 = con.getBean(Singleton.class);
//	Singleton single2 = con.getBean(Singleton.class);
//	System.out.println(single1.hashCode()==single2.hashCode());
//	System.out.println("Bean Count :"+single1.counter);
//	System.out.println("____________________________________");
//	
//	System.out.println("____________________________________");
//	Prototype p1 = con.getBean(Prototype.class);
//	Prototype p2 = con.getBean(Prototype.class);
//	System.out.println(p1.hashCode()==p2.hashCode());
//	System.out.println("Bean Count :"+p1.counter);
//	System.out.println("____________________________________");
//
//	

	}

}
