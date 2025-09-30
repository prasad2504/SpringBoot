package com.gov.NPCI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gov.NPCI.classes.Movie;

@Service
public class MovieService {
	
	
	@Autowired
	private Movie movie;

	public String showdet() {
		String col = "100cr";
		String name = "sitaramam";
		double ratings = 6.5;
		
		movie.collection=col;
		movie.name=name;
		movie.rating=ratings;
		
		if(movie.rating>9.0) {
			return movie.toString();
		}
		
		return "Not a good  movie";
	}
}
