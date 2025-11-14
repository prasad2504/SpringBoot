package com.P_publication.Pune_Publication.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String authorName;
	private String email;
	
	
	@JoinColumn
	@OneToMany
	private List<Book> books;
	
	
	
	public List<Book> getBooks() {
		return books;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public Author(int id, String authorName, String email, List<Book> books) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.email = email;
		this.books = books;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Author(int id, String authorName, String email) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.email = email;
	}
	
	
	public Author() {
		super();
	}
	
	
	

}
