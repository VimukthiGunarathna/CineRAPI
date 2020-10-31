package com.vimma.ciner.dao;
import com.vimma.ciner.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDao {
    @Override
    public void addMovie(Movie movie) {

    }

    @Override
    public Movie getMovie(int id) {
        return null;
    }

    @Override
    public List<Movie> getAllMovies() {
        return null;
    }

    @Override
    public void deleteMovie(int id) {

    }
}
