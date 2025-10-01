package com.gov.NPCI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gov.NPCI.classes.Movie;
import com.gov.NPCI.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService service;
	

	@GetMapping("/getmovie")
	public String getdet() {
		
	return	service.showdet();
	 
	}

	@GetMapping("/get-allmovies")
	public List<Movie> getallMovie(){
		return service.showallmovie();
	}
	
	
	@GetMapping("/Desorder")
	public List<Movie> DesOrder(){
		return service.DesOrder();
	}
	

}
