package com.gov.NPCI.classes;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	public String name;
	public String collection;
	public double rating;
	
	public Movie() {
		System.out.println("Movie created");
	}

	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", collection=" + collection + ", rating=" + rating + "]";
	}
	
	

}
