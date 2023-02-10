package com.example.bestOfTheYear1.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bestOfTheYear1.classi.Movie;
import com.example.bestOfTheYear1.classi.Song;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping()
	public String home(Model model) {
		String name = "samuele";
		model.addAttribute("name", name);
		
		return "index";
	}
	
	
	private List<Movie> getBestMovies(){
		List<Movie> m = new ArrayList<>();
		Movie movie1 = new Movie(1, "film1");
		Movie movie2 = new Movie(2, "film2");
		Movie movie3 = new Movie(3, "film3");
		m.add(movie1);
		m.add(movie2);
		m.add(movie3);
		return m;
	}
	
	@GetMapping("/movies")
	public String bestMovie(Model model) {
		List<Movie> bm = getBestMovies();
		model.addAttribute("movies", bm);
		return "movie";
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
	
	@GetMapping("/songs")
	public String bestSong(Model model) {
		List<Song> bs = getBestSongs();
		model.addAttribute("songs", bs);
		return "song";
	}
}