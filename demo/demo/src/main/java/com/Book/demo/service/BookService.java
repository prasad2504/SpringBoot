package com.Book.demo.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Book.demo.classes.Book;

@Service
public class BookService {
	
	@Autowired
	private Book book;
	
	public List<Book> addBook(){
		
		
		List<Book> list = Arrays.asList(
						new Book("Agnipankh","Dr. A.P.J. Abdul Kalam",200.0,8.5,300,"Padmashri",LocalDate.of(2020,10,21)),
						new Book("Wings of Fire","Dr. A.P.J. Abdul Kalam",250.0,9.0,350,"Padma Bhushan",LocalDate.of(1999,7,1)),
						new Book("Mrityunjay","Shivaji Sawant",300.0,9.2,450,"Sahitya Akademi",LocalDate.of(1967,1,15)),
						new Book("Yayati","V.S. Khandekar",220.0,8.8,400,"Jnanpith Award",LocalDate.of(1959,6,10)),
						new Book("Panipat","Vishwas Patil",280.0,8.7,420,"Sahitya Akademi",LocalDate.of(1988,8,1)),
						new Book("Chhava","Shivaji Sawant",260.0,9.1,380,"None",LocalDate.of(1980,2,18)),
						new Book("Pather Panchali","Bibhutibhushan Bandyopadhyay",200.0,8.6,320,"Rabindra Puraskar",LocalDate.of(1929,5,15)),
						new Book("Raja Shivchatrapati","Babasaheb Purandare",350.0,9.5,500,"Maharashtra Bhushan",LocalDate.of(1950,1,1)),
						new Book("Mritunjay","Amish Tripathi",270.0,8.9,410,"None",LocalDate.of(2010,8,10)),
						new Book("The White Tiger","Aravind Adiga",240.0,8.2,320,"Booker Prize",LocalDate.of(2008,10,14)),
						new Book("Midnight’s Children","Salman Rushdie",280.0,8.5,446,"Booker Prize",LocalDate.of(1981,6,12)),
						new Book("The Guide","R.K. Narayan",210.0,8.3,280,"Sahitya Akademi",LocalDate.of(1958,4,1)),
						new Book("Malgudi Days","R.K. Narayan",190.0,8.7,300,"None",LocalDate.of(1943,11,1)),
						new Book("Godaan","Munshi Premchand",230.0,8.8,410,"Sahitya Akademi",LocalDate.of(1936,3,1)),
						new Book("Nirmala","Munshi Premchand",180.0,8.4,300,"None",LocalDate.of(1928,7,1)),
						new Book("Geetanjali","Rabindranath Tagore",260.0,9.4,320,"Nobel Prize",LocalDate.of(1910,12,1)),
						new Book("Charitraheen","Sarat Chandra Chattopadhyay",200.0,8.5,350,"None",LocalDate.of(1917,1,1)),
						new Book("Devdas","Sarat Chandra Chattopadhyay",210.0,8.6,300,"None",LocalDate.of(1917,7,30)),
						new Book("Chittaranjan","P.L. Deshpande",250.0,9.0,280,"Maharashtra Bhushan",LocalDate.of(1961,1,1)),
						new Book("Vyakti Ani Valli","P.L. Deshpande",200.0,8.9,260,"Sahitya Akademi",LocalDate.of(1962,6,1)),
						new Book("Shala","Milind Bokil",220.0,8.7,280,"Sahitya Akademi",LocalDate.of(2003,8,15)),
						new Book("Kosala","Bhalchandra Nemade",240.0,9.0,320,"Jnanpith Award",LocalDate.of(1963,1,1)),
						new Book("Hindu","Vijay Tendulkar",190.0,8.1,250,"None",LocalDate.of(1989,2,1)),
						new Book("Manoos","Vijay Tendulkar",210.0,8.3,270,"None",LocalDate.of(1982,3,1))

											
				);
				
		return list;
	}
	
	public List<Book> showallBook()
	{
		
		return  addBook().stream().sorted((i,j)->((int)j.rating-(int)i.rating)).collect(Collectors.toList());
	}
	
	
	public List<Book> serachbyname (String nam){
		
		
		List<Book> list = addBook();
		
		return list.stream().filter((i)->(i.Authorname).equalsIgnoreCase(nam)).collect(Collectors.toList());
	}
	
	

}
