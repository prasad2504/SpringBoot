package com.DTOExample.DTO.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTOExample.DTO.Entity.Movie;
import com.DTOExample.DTO.Service.MovieService;

@RestController
@RequestMapping("/movie-controller")
@CrossOrigin
public class MovieController {

	@Autowired
	private MovieService service;
	
	@PostMapping("/add-movie")
	public Movie addmoviei(@RequestBody Movie movie) {
		return service.addmovie(movie);
	}
	
	
	@GetMapping("/get-movies")
	
	public List<Movie> getmoviei() throws InterruptedException{
		
		return service.getmovie();
	}
	
	
	@GetMapping("/get-movie/{id}")
	public Movie getmovieii(@PathVariable int id) {
		return service.getmoviee(id);
	}
	
	
	@DeleteMapping("/delete-by-id/{id}")
	public void deletebyid(@PathVariable int id) {
		service.deletebyid(id);
	}
	
	
}
