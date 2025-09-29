package com.icici.mobikwik.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Session {
	
	public Session() {
		System.out.println("Object created");
		
		
	}
	
	
	public Object getre() {
		return this.hashCode();
	}

}
