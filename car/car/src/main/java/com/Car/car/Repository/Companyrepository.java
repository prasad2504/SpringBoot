package com.Car.car.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Car.car.Entity.Company;



@Repository
public interface Companyrepository extends JpaRepository<Company, Integer> {

}
