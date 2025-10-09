package com.DTOExample.DTO.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DTOExample.DTO.Entity.Actor;
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
	public Actor getactorr(int id) {
		return  repo.findById(id).get();
	}

}
