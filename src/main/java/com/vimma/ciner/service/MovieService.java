package com.vimma.ciner.service;

import com.vimma.ciner.controller.AddMovieRequest;
import com.vimma.ciner.models.Movie;
import com.vimma.ciner.models.TimeSlot;

import java.lang.reflect.Array;
import java.util.List;

public interface MovieService {
    void addMovie(AddMovieRequest movie);
    List<Movie>getAllMovies();
    Movie getMovie(Integer movie_id);
    void updateMovie(AddMovieRequest updatedMovie, Movie movie);
    void deleteMovie(int movie_id);
    List<TimeSlot> getTimeSlots(Integer movie_id);
}
