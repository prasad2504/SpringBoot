package com.Car.car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Car.car.Entity.Company;
import com.Car.car.Repository.Companyrepository;

@Service
public class CompanyService {
	
	
	@Autowired
	private Companyrepository repo;
	
	
	public Company addcompany(Company company) {
		return repo.save(company);
			
	}
	
	public List<Company> getcompany(){
		return repo.findAll();
	}

	
}
