package com.Car.car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Car.car.Entity.Company;
import com.Car.car.Service.CompanyService;

@RestController
public class CompanyController {
	
	
	@Autowired
	private CompanyService service;
	
	
	//add company
	@PostMapping("/addcompany")
	public ResponseEntity<String> addcompany(@RequestBody Company company){
		
		service.addcompany(company);
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Company added sucessfully");
	}
	
	//get company
	@GetMapping("/getcompany")
	public ResponseEntity<List<Company>> getallcompany(){
		
		List<Company> company = service.getcompany();
		
		return ResponseEntity.status(HttpStatus.OK).body(company);
	}

}
