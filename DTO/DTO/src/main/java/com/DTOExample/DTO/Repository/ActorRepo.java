package com.DTOExample.DTO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DTOExample.DTO.Entity.Actor;

public interface ActorRepo extends JpaRepository<Actor, Integer> {

}
