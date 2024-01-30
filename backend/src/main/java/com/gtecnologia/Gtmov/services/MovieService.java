package com.gtecnologia.Gtmov.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gtecnologia.Gtmov.entities.Movie;
import com.gtecnologia.Gtmov.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;

	@Transactional(readOnly = true)
	public Movie findById(Long id) {
		
		Optional<Movie> obj = movieRepository.findById(id);
		return obj.get();
	}
}
