package com.P_publication.Pune_Publication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.P_publication.Pune_Publication.Entity.Book;
import com.P_publication.Pune_Publication.Service.BookService;



@RestController
@RequestMapping("/bookcontroller")
public class BookController {

	
	@Autowired
   private BookService service;
	
	
	@PostMapping("/addbook")
	@CacheEvict(value="books", allEntries=true)
	public Book addBookC(@RequestBody Book book) throws Exception {
		
		return service.addbook(book);
	}
	
	
	
	@GetMapping("/getbooks")
	@Cacheable(value="books")
	public List<Book> getbook() throws InterruptedException{
		
		Thread.sleep(5000);
		
		System.out.println("__________________________________________");
		return service.getbook();
	}
	
	
}
	

