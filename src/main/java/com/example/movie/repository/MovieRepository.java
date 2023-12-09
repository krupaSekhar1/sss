package com.example.movie.repository;
import com.example.movie.model.*;
import java.util.*;

public interface MovieRepository{
    ArrayList <Movie> getMovies();
    Movie getMovieById(int movieId);
    Movie addMovie(Movie movie);
    Movie updateMovie(int movieId,Movie movie);
    void deleteMovie(int movieId);
    
}