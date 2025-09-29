package com.icici.mobikwik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.mobikwik.component.Request;

@RestController
public class RequestController {
	
	
	@Autowired
	private Request req1;
	
	
	
	//this will generate hashcode 
	@GetMapping("/get-code")
	public Object getcocode() {
		return req1.getre();
	}
	
	
	//this will also generate hashcode but diff than first even if instance is same req1 coz of requestscope 
	//coz request score create new instance per http req
	@GetMapping("/get-code2")
	public Object getcocode2() {
		return req1.getre();
	}
	

}
