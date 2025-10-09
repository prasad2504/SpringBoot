package com.DTOExample.DTO.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DTOExample.DTO.Dto.ActorDto;
import com.DTOExample.DTO.Dto.MovieDto;
import com.DTOExample.DTO.Entity.Actor;
import com.DTOExample.DTO.Entity.Movie;
import com.DTOExample.DTO.Repository.ActorRepo;

@Service
public class ActorService {


	@Autowired
	private ActorRepo repo;
	
	
	//1
	public Actor addactor(Actor actor) {
		return repo.save(actor);
	}
	
	//2
	public List<Actor> getactor(){
		return repo.findAll();
	}
	
	//3
	public ActorDto getactorr(int id) {
		return  converter(repo.findById(id).get());
	}
	
	
	
	public static ActorDto converter(Actor actor) {
		
		ActorDto dto = new ActorDto();
		
		dto.setAname(actor.getAname());
		dto.setMovies(actor.getMovies().stream().map(ActorService::con2).collect(Collectors.toList()));
	return dto;
	}
	
	public static MovieDto con2(Movie movie) {
		
		MovieDto dto = new MovieDto();
		dto.setMname(movie.getMname());
		
		return dto;
	}
//-------------------------------------sql 	
	
//	hard code sql 
//	public List<Actor> findbyname(){
//		return repo.getbyname();
//	}
	//select
	public List<Actor> findbyname(String name){
		return repo.getbyname(name);
	}
	
	
	//update
	public int updatebyidd( int id,String name) {
		return repo.updatebyid(name, id);
	}

	
	//delete
	public void deletebyid(int id) {
		 repo.deleteById(id);
	}
	
}
