package com.DTOExample.DTO.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DTOExample.DTO.Entity.Movie;
import com.DTOExample.DTO.Repository.MovieRepo;

@Service
public class MovieService {

	@Autowired
	private MovieRepo repo;
	
	
	//1
	public Movie addmovie(Movie movie) {
		return repo.save(movie);
	}
	
	
	//2
	public List<Movie> getmovie(){
		return repo.findAll();
	}
	
	
	//3
	public Movie getmoviee(int id) {
		return repo.findById(id).get();
	}
	
	
}
