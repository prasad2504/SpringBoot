package com.Car.car.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CarId;
	
	private String CarName;
	
	private double CarPrice;
	
	private String CarEngine;

	public Car(int carId, String carName, double carPrice, String carEngine) {
	
		CarId = carId;
		CarName = carName;
		CarPrice = carPrice;
		CarEngine = carEngine;
	}

	public Car() {
		
	}

	public int getCarId() {
		return CarId;
	}

	

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public double getCarPrice() {
		return CarPrice;
	}

	public void setCarPrice(double carPrice) {
		CarPrice = carPrice;
	}

	public String getCarEngine() {
		return CarEngine;
	}

	public void setCarEngine(String carEngine) {
		CarEngine = carEngine;
	}
	

	@JoinColumn
	@ManyToOne
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Car(int carId, String carName, double carPrice, String carEngine, Company company) {
		super();
		CarId = carId;
		CarName = carName;
		CarPrice = carPrice;
		CarEngine = carEngine;
		this.company = company;
	}

	
	
	

	
	
	
	
}
