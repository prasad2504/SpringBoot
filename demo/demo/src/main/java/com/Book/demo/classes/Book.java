package com.Book.demo.classes;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	public String Bookname;
	public String Authorname;
	public double Bookprice;
	public double rating;
	public double tax;
	public String Bookaward;
	public LocalDate date;
	
	
	public Book() {
		System.out.println("Book created");
	}


	public Book(String bookname, String authorname, double bookprice, double rating, double tax, String bookaward,
			LocalDate date) {
		super();
		Bookname = bookname;
		Authorname = authorname;
		Bookprice = bookprice;
		this.rating = rating;
		this.tax = tax;
		Bookaward = bookaward;
		this.date = date;
	}


	@Override
	public String toString() {
		return "Book [Bookname=" + Bookname + ", Authorname=" + Authorname + ", Bookprice=" + Bookprice + ", rating="
				+ rating + ", tax=" + tax + ", Bookaward=" + Bookaward + ", date=" + date + "]";
	}
	
	



	
	
	

}
