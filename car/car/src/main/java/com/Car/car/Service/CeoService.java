package com.Car.car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Car.car.Entity.Ceo;
import com.Car.car.Repository.CeoRepository;

@Service
public class CeoService {

	
	@Autowired
	private CeoRepository repo;
	
	//addceo
	public Ceo addceo(Ceo ceo) {
		
		return repo.save(ceo);
	}
	
	//get ceo
	public List<Ceo> getallceo(){
		return repo.findAll();
	}
}
