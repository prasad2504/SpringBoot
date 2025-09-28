package com.ebay.Big.Billion.days.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	
	@GetMapping("/hi")
	public String SayHi() {
		System.out.println("HIII");
		return "hiii";
	}
	
	@PostMapping("/add")
	public String AddData() {
		System.out.println("Data is added...");
		return "Data is added...";
	}
	
	@DeleteMapping("/delete")
	public String DeleteData() {
		System.out.println("Data is deleted...");
		return "Data is deleted...";
	}
	
	
	@PutMapping("/put")
	public String PutData() {
		System.out.println("Data updated sucessfully...");
		return "Data updated sucessfully...";
	}

}
