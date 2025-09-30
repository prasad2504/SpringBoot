package com.icici.mobikwik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.mobikwik.component.Application;

@RestController
public class ApplicationController {
	
	@Autowired
	private Application app;
	
	@Autowired
	private Application app2;
	
	
	
	@GetMapping("/getAcode")
	public Object GetCode() {
		return app.getre();
	}

}
