package com.Pragati_publication.Pune_Publication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Pragati_publication.Pune_Publication.Entity.Book;
import com.Pragati_publication.Pune_Publication.Service.BookService;



@RestController
public class Controller {

	
	@Autowired
   private BookService service;
	
	
	@PostMapping("/addbook")
	public Book addBookC(@RequestBody Book book) throws Exception {
		
		return service.addbook(book);
	}
	
}
	

