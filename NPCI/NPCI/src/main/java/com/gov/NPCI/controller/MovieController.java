package com.gov.NPCI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	//find movie by hardcode value example
	@GetMapping("/getmoviebyname")
	public List<Movie> Searchbyname(){
		
		return service.Searchbyname("PK");
	}
	
	
	//find movie using @RequestParam
	@PostMapping("/findmoviebyname")
	public List<Movie> findmovie(@RequestParam("name") String name){
		
		return service.Searchbyname(name);
	}
	


//	we can write this above without ("name") also example below
//	@PostMapping("/findmoviebyname")
//	public List<Movie> findmovie(@RequestParam String name){
//		
//		return service.Searchbyname(name);
//	}
	
	
	
	
	//find movie using @PathVariable
	@PostMapping("/findmovie/{var}")
	public List<Movie> findmovie1(@PathVariable("var") String name2){
		
		return service.Searchbyname(name2);
	}
	
//		we can write this above without ("var") also example below
//		public List<Movie> findmovie1(@PathVariable("var") String name2){
//		
//		return service.Searchbyname(name2);
//	}
	
	@PostMapping("/findbyrating/{rat}")
	public List<Movie> findbyrating(@PathVariable("rat") double rating){
		
		return service.Searchbyrating(rating);
	}
	
	
	@PostMapping("/findbynameandrating/{name}/{rat}")
	public List<Movie> findbyratandname(@PathVariable String name , @PathVariable double rat){
		
		return service.SearchByNameAndRat(name, rat);
	}
	
	//------------------------------------------adding movie------------------------------------------------------------------------------------

	
	
	//controller using @requestparam 
	@PostMapping("/addm")
	public List<Movie> addm(@RequestParam String  name,@RequestParam String collection ,@RequestParam double rating){
		return service.addmoive(name, collection, rating);
	}
	
	
	//controller using @requestbody in this
	@PostMapping("/addmovie")
	public List<Movie> addMovie(@RequestBody Movie movie) {
		
		return service.AddMovie(movie);
	}
	
	
}
