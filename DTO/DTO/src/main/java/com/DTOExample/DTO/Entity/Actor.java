package com.DTOExample.DTO.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Actor {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	
	@Column(nullable=false)
	private String aname;
	
	@Column(nullable=false)
	private String amobile;
	
	
	@JoinColumn
	@OneToMany
	private List<Movie> movies;
	
	

	public List<Movie> getMovies() {
		return movies;
	}


	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}


	public int getAid() {
		return aid;
	}


	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAmobile() {
		return amobile;
	}

	public void setAmobile(String amobile) {
		this.amobile = amobile;
	}
	
	
	

}
