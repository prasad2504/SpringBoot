package com.DTOExample.DTO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DTOExample.DTO.Entity.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
