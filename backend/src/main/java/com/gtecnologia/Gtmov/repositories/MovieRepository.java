package com.gtecnologia.Gtmov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gtecnologia.Gtmov.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
