package com.icici.mobikwik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	
	@GetMapping("/getdata")
	public String Gretting() {
		return "NAMASTE";
		
	}
}
