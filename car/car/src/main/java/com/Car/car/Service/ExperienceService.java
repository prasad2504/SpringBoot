package com.Car.car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Car.car.Entity.Experience;
import com.Car.car.Repository.ExperienceRepository;

@Service
public class ExperienceService {
	
	@Autowired
	private ExperienceRepository repo;

	
	//add experience
	public Experience addex(Experience ex) {
		
		return repo.save(ex);
	}
	
	//get experience
	public List<Experience> getex(){
		return repo.findAll();
	}
}
