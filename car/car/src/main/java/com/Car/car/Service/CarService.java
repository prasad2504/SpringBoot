package com.Car.car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Car.car.Entity.Car;
import com.Car.car.Repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository repo;
	
	
	//adding car
	public Car addcar(Car car) {
		return repo.save(car);
	}
	
	//getting car
	public List<Car> getcar() {
		return repo.findAll();
	}

	
}
