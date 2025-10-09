package com.DTOExample.DTO.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DTOExample.DTO.Entity.Movie;
import com.DTOExample.DTO.Service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService service;
	
	@PostMapping("/add-movie")
	public Movie addmoviei(@RequestBody Movie movie) {
		return service.addmovie(movie);
	}
	
	
	
	
}
