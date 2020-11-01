package com.vimma.ciner.service;

import com.vimma.ciner.controller.AddMovieRequest;
import com.vimma.ciner.models.Movie;

import java.lang.reflect.Array;
import java.util.List;

public interface MovieService {
    void addMovie(AddMovieRequest movie);
    List<Movie>getAllMovies();
    Movie getMovie(int movie_id);
    void updateMovie();
    void deleteMovie(int movie_id);
}
