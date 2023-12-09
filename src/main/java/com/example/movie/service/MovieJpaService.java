package com.example.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;
import com.example.movie.model.*;
import com.example.movie.repository.*;

@Service
public class MovieJpaService implements MovieRepository {
  @Autowired
  public MovieJpaRepository movieRepository;

  @Override

  public void deleteMovie(int movieId) {
    try {
      movieRepository.deleteById(movieId);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }

  @Override

  public Movie updateMovie(int movieId, Movie movie) {
    try {
      Movie newMovie = movieRepository.findById(movieId).get();
      if (movie.getMovieName() != null) {
        newMovie.setMovieName(movie.getMovieName());
      }
      if (movie.getLeadActor() != null) {
        newMovie.setLeadActor(movie.getLeadActor());
      }
      movieRepository.save(newMovie);
      return newMovie;
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }

  @Override

  public Movie addMovie(Movie movie) {
    movieRepository.save(movie);
    return movie;
  }

  @Override

  public Movie getMovieById(int movieId) {
    try {
      return movieRepository.findById(movieId).get();
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public ArrayList<Movie> getMovies() {
    return (ArrayList<Movie>) movieRepository.findAll();
  }
}