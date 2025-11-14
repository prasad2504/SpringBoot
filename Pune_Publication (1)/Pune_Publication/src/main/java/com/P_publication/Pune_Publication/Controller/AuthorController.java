package com.P_publication.Pune_Publication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.P_publication.Pune_Publication.Entity.Author;
import com.P_publication.Pune_Publication.Service.AuthorService;

@RestController
@RequestMapping("/author-controller")
public class AuthorController {

	
	@Autowired
	private AuthorService service;
	
	
	@PostMapping("/add-author")
	public Author addA(@RequestBody Author author) throws Exception {
		return service.addAuthor(author);
	}
	
	
	@GetMapping("/get-author")
	public List<Author> getauthor() throws Exception{
		
		return service.getallauthor();
	}
}
