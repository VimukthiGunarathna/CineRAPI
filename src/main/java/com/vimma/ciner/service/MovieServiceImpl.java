package com.vimma.ciner.service;

import com.vimma.ciner.dao.MovieDao;
import com.vimma.ciner.models.Movie;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    MovieDao movieDao;

    @Override
    public void addMovie(Movie movie) {
        movieDao.addMovie(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }

    @Override
    public Movie getMovie(int id) {
        return movieDao.getMovie(id);
    }

    @Override
    public void updateMovie() {
    }

    @Override
    public void deleteMovie(int id) {
        movieDao.deleteMovie(id);
    }
}
