package com.Car.car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Car.car.Entity.Ceo;
import com.Car.car.Service.CeoService;

@RestController
public class CeoController {
	
	
	@Autowired
	private CeoService service;
	
	//add ceo
	@PostMapping("/addceo")
	public ResponseEntity<String> addceo(@RequestBody Ceo ceo) {
		
		    service.addceo(ceo);
		    
		    return ResponseEntity.status(HttpStatus.CREATED).body("CEO Added sucessfully");
	}

	
	// get ceo's
	@GetMapping("/getcar")
	public ResponseEntity<List<Ceo>> getceos(){
		List<Ceo> ceo = service.getallceo();
		
		return ResponseEntity.status(HttpStatus.OK).body(ceo);
	}
}
