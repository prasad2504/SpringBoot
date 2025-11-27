package com.Car.car.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Car.car.Entity.Headquarter;



@Repository
public interface HeadquarterRepository extends JpaRepository<Headquarter, Integer> {

}
