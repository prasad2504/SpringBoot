package com.Car.car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Car.car.Entity.Headquarter;
import com.Car.car.Repository.HeadquarterRepository;

@Service
public class HeadquarterService {
	
	@Autowired
	private HeadquarterRepository repo;
	
	//add hq
	public Headquarter addhq(Headquarter hq) {
		return repo.save(hq);
	}
	
	//get hq
	public List<Headquarter> gethq(){
		return repo.findAll();
	}

}
