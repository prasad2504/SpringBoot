package com.icici.mobikwik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.mobikwik.component.Session;

@RestController
public class SessionController {

	@Autowired
	private Session s1;
	
	@GetMapping("/getScode")
	public Object get() {
	 return	s1.getre();
	}
}
