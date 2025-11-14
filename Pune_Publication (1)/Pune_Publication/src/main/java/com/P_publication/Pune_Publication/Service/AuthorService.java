package com.P_publication.Pune_Publication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.P_publication.Pune_Publication.Entity.Author;
import com.P_publication.Pune_Publication.Repository.AuthorRepo;

@Service
public class AuthorService {
	
	@Autowired
	AuthorRepo repo;
	
	public Author addAuthor(Author author) throws Exception {
		
		if(author == null) {
			throw new Exception("author  can not be null");
		}
		return repo.save(author);
	}
	
	public List<Author> getallauthor() throws Exception{
		
		if( !repo.findAll().isEmpty()) {
			return repo.findAll();
		}else {
			throw new Exception("something went wrong happinggggggg");
		}
		
		
		
	}

}
