package com.icici.mobikwik.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {
	
	public Prototype() {
		System.out.println("Object Created");
		counter++;
	}
	
	
	public Object getcode() {
		return this.hashCode();
	}
	
	public static int counter =0;


}
