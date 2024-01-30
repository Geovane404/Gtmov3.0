package com.gtecnologia.Gtmov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtecnologia.Gtmov.entities.Movie;
import com.gtecnologia.Gtmov.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Movie> findById(@PathVariable Long id){
		
		Movie movie = movieService.findById(id);
		return ResponseEntity.ok().body(movie);
	}
}
