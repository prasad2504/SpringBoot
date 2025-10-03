package com.gov.NPCI.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gov.NPCI.classes.Movie;

@Service
public class MovieService {
	
	
	@Autowired
	private Movie movie;

	public String showdet() {
		String col = "100cr";
		String name = "sitaramam";
		double ratings = 6.5;
		
		movie.collection=col;
		movie.name=name;
		movie.rating=ratings;
		
		if(movie.rating>9.0) {
			return movie.toString();
		}
		
		return "Not a good  movie";
	}
	
	public List<Movie> AddMovies(){
		List<Movie> list = Arrays.asList(new Movie("Inception","830 cr",9.0),
				new Movie("Interstellar","715 cr",8.6),
				new Movie("The Dark Knight","1005 cr",9.1),
				new Movie("Titanic","2200 cr",7.9),
				new Movie("Avatar","2920 cr",7.8),
				new Movie("Avengers: Endgame","2797 cr",8.5),
				new Movie("The Avengers","1518 cr",8.0),
				new Movie("Iron Man","585 cr",7.9),
				new Movie("Spider-Man: No Way Home","1920 cr",8.2),
				new Movie("Doctor Strange","677 cr",7.5),
				new Movie("The Lion King","968 cr",8.5),
				new Movie("Frozen","1280 cr",7.4),
				new Movie("Finding Nemo","940 cr",8.1),
				new Movie("Toy Story","394 cr",8.3),
				new Movie("Coco","814 cr",8.4),
				new Movie("The Godfather","246 cr",9.2),
				new Movie("The Shawshank Redemption","100 cr",9.3),
				new Movie("Forrest Gump","678 cr",8.8),
				new Movie("Gladiator","460 cr",8.5),
				new Movie("Braveheart","210 cr",8.3),
				new Movie("Slumdog Millionaire","378 cr",8.0),
				new Movie("3 Idiots","460 cr",8.4),
				new Movie("PK","740 cr",8.1),
				new Movie("Dangal","3000 cr",8.4),
				new Movie("Bahubali2","1810 cr",8.2));
		return list;
		
	}
	
	
	public List<Movie> showallmovie(){
	
		List<Movie> list = AddMovies();
		
		return list.stream().collect(Collectors.toList());
	}
	
	
	
	public List<Movie> DesOrder(){
		
		List<Movie> list =AddMovies();
		
		return list.stream().sorted((i,j)->((int)j.rating-(int)i.rating)).collect(Collectors.toList());
	}
	
	
	
	
	public List<Movie> Searchbyname(String na){
		List<Movie> list = AddMovies();
		
		return list.stream().filter((i)-> (i.name).equalsIgnoreCase(na)).collect(Collectors.toList());
		
	}
	
	public List<Movie> Searchbyrating(double rat){
		
		List<Movie> list = AddMovies();
		
		return list.stream().filter((i)->(i.rating==rat)).sorted( (i,j)->((int)j.rating-(int)i.rating) ).collect(Collectors.toList());
	}
	
	
	public List<Movie> SearchByNameAndRat(String name,double rat){
		
		List<Movie> list = AddMovies();
		
		return list.stream().filter( (i)->(i.name).equalsIgnoreCase(name) && (i.rating==rat)).collect(Collectors.toList());
	}
	
//------------------------------------------adding movie------------------------------------------------------------------------------------
	
	//adding movie using @requestparam or @pathvariable makes our url unreadable and long so better to use @requestbody.
	
	public List<Movie> addmoive(String name,String collection,double rating){
		
		List<Movie> l2 = AddMovies().stream().collect(Collectors.toList());
		
			l2.add(new Movie(name,collection,rating));
			
		System.out.println(l2);
		
	return l2;	
	}
	
	
	
	
	
	//adding movie using @requestbody annotation
	public List<Movie> AddMovie(Movie movie) {
		
		List<Movie> l1= AddMovies().stream().collect(Collectors.toList());
		
		l1.add(movie);
		
		System.out.println(l1);
		
		return l1;
	}
	
	
}
