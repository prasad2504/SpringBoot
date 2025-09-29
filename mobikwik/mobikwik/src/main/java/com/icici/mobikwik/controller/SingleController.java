package com.icici.mobikwik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.mobikwik.component.Prototype;
import com.icici.mobikwik.component.Singleton;

@RestController
public class SingleController {

	
	@Autowired
	private Singleton single1;
	
	@Autowired
	private Singleton single2;
	
	@GetMapping("/getdata")
	public String Gretting() {
		
		Boolean result = single1.hashCode()==single2.hashCode();
		return "NAMASTE"+result;
		
	}

	
	@GetMapping("getCode")
	public Object getre() {
	return	single1.getcode() + "      "+single2.hashCode() +" object created of prototype :" +single2.counter;
	}

	
}
