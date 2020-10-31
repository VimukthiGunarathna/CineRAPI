package com.vimma.ciner.service;

import com.vimma.ciner.dao.MovieDao;
import com.vimma.ciner.models.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{
    @Autowired
    MovieDao movieDao;
    Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Override
    public void addMovie(Movie movie) {
        movieDao.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return null;
    }

    @Override
    public Movie getMovie(int id) {
        return null;
    }

    @Override
    public void updateMovie() {
    }

    @Override
    public void deleteMovie(int id) {
        movieDao.deleteById(id);
    }
}
