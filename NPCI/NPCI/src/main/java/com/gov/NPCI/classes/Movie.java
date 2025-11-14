package com.gov.NPCI.classes;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	public String name;
	public String collection;
	public double rating;
	
	public Movie() {
		System.out.println("Movie created");
	}

	
	
	public Movie(String name, String collection, double rating) {
		super();
		this.name = name;
		this.collection = collection;
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "Movie [name=" + name + ", collection=" + collection + ", rating=" + rating + "]";
	}
	
	

}
