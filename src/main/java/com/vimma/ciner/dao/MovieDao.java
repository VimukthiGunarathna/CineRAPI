package com.vimma.ciner.dao;

import com.vimma.ciner.models.Movie;

import java.util.List;

public interface MovieDao {
    void addMovie(Movie movie);
    Movie getMovie(int movie_id);
    List<Movie>getAllMovies();
    void deleteMovie(int movie_id);
}
