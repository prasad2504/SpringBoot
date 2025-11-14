package com.DTOExample.DTO.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTOExample.DTO.Dto.ActorDto;
import com.DTOExample.DTO.Entity.Actor;
import com.DTOExample.DTO.Service.ActorService;

@RestController
@RequestMapping("/actor-controller")
@CrossOrigin(allowedHeaders = "http://localhost:5174/")
public class ActorController {

	
	@Autowired
	private ActorService service;
	
	
	
	@PostMapping("/add-actor")
	public Actor addactorr(@RequestBody Actor actor) {
		return service.addactor(actor);
	}
	
	
	@GetMapping("/get-actors")

	public List<Actor> getactorr(){
		return service.getactor();
	}
	
	
	@GetMapping("/get-actor/{id}")
	public ActorDto getactorrrbyid(@PathVariable int id) {
		return service.getactorr(id);
	}
	
//	----------------------------------------sql
	
	
//	hard code for one api
//	@GetMapping("/get-by-name")
//	public List<Actor> getbynamee(){
//		return service.findbyname();
//	}
	
	@GetMapping("/get-by-name/{name}")
	public List<Actor> getbynamee(@PathVariable String name){
		return service.findbyname(name);
	}
	
	@PutMapping("/update-by-id/{id}/{name}")
	public int updatebyiddd(@PathVariable int id , @PathVariable String name) {
		return service.updatebyidd(id, name);
	}
	
	
	@DeleteMapping("/delete-by-id/{id}")
	public void deletebyid(@PathVariable int id) {
		service.deletebyid(id);
	}
	
}
