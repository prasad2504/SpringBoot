package com.Car.car.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Car.car.Entity.Experience;


@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {

}
