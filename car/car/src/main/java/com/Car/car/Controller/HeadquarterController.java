package com.Car.car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Car.car.Entity.Headquarter;
import com.Car.car.Service.HeadquarterService;

@RestController
public class HeadquarterController {
	
	@Autowired
	private HeadquarterService service;
	
	//add hq
	@PostMapping("/addhq")
	public ResponseEntity<String> addhq(@RequestBody Headquarter hq){
		
		service.addhq(hq);
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Headquarter is added...");
	}
	
	
	//get hq
	@GetMapping("/gethq")
	public ResponseEntity<List<Headquarter>> gethq(){
		
		List<Headquarter> hq = service.gethq();
		 
		return ResponseEntity.status(HttpStatus.OK).body(hq);
	}

}
