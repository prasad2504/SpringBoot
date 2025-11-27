package com.Car.car.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Car.car.Entity.Car;
import com.Car.car.Service.CarService;

@RestController
public class CarController {
	
	@Autowired
	private CarService service;
	
	
	
	//adding car
	@PostMapping("/addcar")
	public ResponseEntity<String> addcar(@RequestBody Car car){
		
		service.addcar(car);
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Car ADDED");
	}

	//getting cars
	@GetMapping("/getallcars")
	public ResponseEntity<List<Car>> getallcars(){
		
		List<Car> cars = service.getcar();
		
		return ResponseEntity.status(HttpStatus.OK).body(cars);
	}





}
