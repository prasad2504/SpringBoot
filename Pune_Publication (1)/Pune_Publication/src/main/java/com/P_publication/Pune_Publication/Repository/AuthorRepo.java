package com.P_publication.Pune_Publication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.P_publication.Pune_Publication.Entity.Author;



@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer> {
	
	

}
