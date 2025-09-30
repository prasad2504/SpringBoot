package com.icici.mobikwik.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("application")
public class Application {

	public Application() {
		System.out.println("Object created");
	}
	
	public Object getre() {
		return this.hashCode();
	}
}
