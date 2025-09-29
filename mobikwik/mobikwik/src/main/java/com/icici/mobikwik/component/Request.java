package com.icici.mobikwik.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Request {
	
	public Request() {
		System.out.println("Object Created......");
	}
	
	
	public Object getre() {
		return this.hashCode();
	}

}
