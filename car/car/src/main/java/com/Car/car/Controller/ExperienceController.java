package com.Car.car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Car.car.Entity.Experience;
import com.Car.car.Service.ExperienceService;

@RestController
public class ExperienceController {
	
	@Autowired
	private ExperienceService service;
	
	
	//add experience
	@PostMapping("/addex")
	public ResponseEntity<String> addex(@RequestBody Experience ex){
		service.addex(ex);
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Experience added succesfully...");
	}

	//show experience 
	@GetMapping("/getex")
	public ResponseEntity<List<Experience>> getex(){
		
		List<Experience> es =service.getex();
		
		return ResponseEntity.status(HttpStatus.OK).body(es);
		
	}
}
