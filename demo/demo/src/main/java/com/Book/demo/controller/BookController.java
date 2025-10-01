package com.Book.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Book.demo.classes.Book;
import com.Book.demo.service.BookService;

@RestController
public class BookController {
	
	
	@Autowired	
	private BookService service;
	
	
	@GetMapping("/get-allbooks")
	public List<Book> getall()
	{
		return service.showallBook();
	}
	
	
	
	

}
