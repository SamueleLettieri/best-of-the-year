package com.example.bestOfTheYear1.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bestOfTheYear1.classi.Movie;
import com.example.bestOfTheYear1.classi.MovieSong;
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
	

	MovieSong ms = new MovieSong();

	@GetMapping("/movies")
	public String bestMovie(Model model) {
		List<Movie> bm = ms.getMovies();
		model.addAttribute("movies", bm);
		return "movie";
		
	}
 	

	
	@GetMapping("/songs")
	public String bestSong(Model model) {
		List<Song> bs = ms.getSong();
		model.addAttribute("songs", bs);
		return "song";
	}
	

	
	@GetMapping("/movies/{id}")
	public String film(Model model, @PathVariable("id") String id) {
		model.addAttribute("infoMovie", ms.getIdMovies(Integer.parseInt(id)));
		return "infoMovie";
	}
	
	@GetMapping("/songs/{id}")
	public String canzone(Model model, @PathVariable("id") String id) {
		model.addAttribute("infoSong", ms.getIdSong(Integer.parseInt(id)));
		return "infoSong";
	}
	

}