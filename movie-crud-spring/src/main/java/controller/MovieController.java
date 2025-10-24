
package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Dao.MovieDao;
import entity.Movie;

@Controller
public class MovieController {
	
	
	@Autowired
	MovieDao dao;
	
	
	// This end point used to show the add page
	@GetMapping("/add")
	public String add() {
		return "add.jsp";
	}
	
	
	@PostMapping("/add")
	public String add(@ModelAttribute Movie movie,ModelMap map) {
		dao.save(movie);
		map.put("message", "Movie saved successfully");
		return "index.jsp";
	}
	
	
	
	@GetMapping("/view")
	public String fetch(ModelMap map) {
		
		List<Movie> movies=dao.fetchAll();
		map.put("movies", movies);
		return "fetch.jsp";
	}
}
