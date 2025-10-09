package com.DTOExample.DTO.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.DTOExample.DTO.Entity.Actor;

import jakarta.transaction.Transactional;

public interface ActorRepo extends JpaRepository<Actor, Integer> {

//	hard code value
//	@Query(value = "select * from actor where aname = 'prasd';" , nativeQuery = true)
//	public  List<Actor> getbyname();
	
	
	//insert query
	@Query(value = "select * from actor where aname = :name;" , nativeQuery = true)
	public  List<Actor> getbyname(@Param("name") String name);
	
	//update query   update actor set aname="prasad" where aid = 1;
	@Modifying
	@Transactional
	@Query(value = "update actor set aname= :name where aid = :id ;" ,nativeQuery = true)
	public int updatebyid(@Param("name") String name , @Param("id") int id);
	
	//delete query
	
}


