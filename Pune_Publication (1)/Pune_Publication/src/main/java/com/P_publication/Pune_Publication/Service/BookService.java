package com.P_publication.Pune_Publication.Service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.P_publication.Pune_Publication.Entity.Book;
import com.P_publication.Pune_Publication.Repository.BookRepo;

@Service
public class BookService {
	

	
	@Autowired
	private BookRepo repo;
	
	
	
	public Book addbook(Book book) throws Exception
	{
		
		if(repo.existsById(book.getId())) {
			throw new Exception("Book with ID " + book.getId() + " already exists!");
		}
		
		if(book==null)
		{
			throw new Exception("book can't be null");
		}
		System.out.println("recieved book :"+book.getName());
		System.out.println("savinggggg.....");
	    Book book_saved=repo.save(book);
	    System.out.println("book saved......");
	    
	    return  book_saved;
	}  
	
	public List<Book> getbook(){
		return repo.findAll();
	}


}
