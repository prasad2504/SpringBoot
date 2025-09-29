package com.icici.mobikwik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.mobikwik.component.Prototype;


@RestController
public class PrototypeController {

	

	
	@Autowired
	private Prototype p1;
	
	@Autowired
	private Prototype p2;
	
	@GetMapping("/getdatap")
	public String Grettings() {
	
		Boolean result = p1.hashCode()==p2.hashCode();
		return "NAMASTE"+result;
	}
	
	
	
	

	@GetMapping("getCodep")
	public Object getrep() {
		
	return	p1.getcode()+ "       "+p2.hashCode() +" object created of prototype :" +p1.counter ;
	}
	
}
