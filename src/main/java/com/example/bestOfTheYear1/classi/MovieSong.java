package com.example.bestOfTheYear1.classi;

import java.util.ArrayList;
import java.util.List;

public class MovieSong {

	private List<Movie> m;
	private List<Song> s;
	
	public  MovieSong() {
		m = new ArrayList<>();
		s = new ArrayList<>();
		Movie movie1 = new Movie(1, "film1");
		Movie movie2 = new Movie(2, "film2");
		Movie movie3 = new Movie(3, "film3");
		Song song1 = new Song(1, "canzone1");
		Song song2 = new Song(2, "canzone2");
		Song song3 = new Song(3, "canzone3");
		m.add(movie1);
		m.add(movie2);
		m.add(movie3);
		s.add(song1);
		s.add(song2);
		s.add(song3);
		
	
	}
	
	public Movie getIdMovies(int id ) {
		return m.get(id-1);
	}

	public List<Movie> getMovies() {
		return m;
	}

	
	public Song getIdSong(int id ) {
		return s.get(id-1);
	}

	public List<Song> getSong() {
		return s;
	}
	
	
	


}

/*	private List<Movie> getBestMovies(){
		List<Movie> m = new ArrayList<>();
		Movie movie1 = new Movie(1, "film1");
		Movie movie2 = new Movie(2, "film2");
		Movie movie3 = new Movie(3, "film3");
		m.add(movie1);
		m.add(movie2);
		m.add(movie3);
		return m;
	}	
		
		
		
	private List<Song> getBestSongs(){
		List<Song> s = new ArrayList<>();
		Song song1 = new Song(1, "canzone1");
		Song song2 = new Song(2, "canzone2");
		Song song3 = new Song(3, "canzone3");
		s.add(song1);
		s.add(song2);
		s.add(song3);
		return s;
	}
	
*/