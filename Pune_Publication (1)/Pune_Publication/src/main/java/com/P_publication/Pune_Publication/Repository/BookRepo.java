 package com.P_publication.Pune_Publication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.P_publication.Pune_Publication.Entity.Book;

import jakarta.persistence.Id;

public interface BookRepo extends JpaRepository<Book,Integer> {

	
	
}
