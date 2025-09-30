package com.gov.NPCI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gov.NPCI.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService serive;
	

	@GetMapping("/getmovie")
	public String getdet() {
		
	return	serive.showdet();
	 
	}
	

}
