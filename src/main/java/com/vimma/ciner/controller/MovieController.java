package com.vimma.ciner.controller;

import com.vimma.ciner.models.Movie;
import com.vimma.ciner.service.MovieService;
import com.vimma.ciner.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class MovieController {
    @Autowired
    private MovieService service; // Service which will do all the data manipulations

    // POST CALLS
    @PostMapping
    public void addMovie(@RequestBody Movie movie){
         service.addMovie(movie);
    }

    // GET CALLS
    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies(@PathVariable String name) {
        return  service.getAllMovies();
    }
    @GetMapping("/getMovie/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable("id") int id ) {
        try {
            Movie movie = service.getMovie(id);
            return new ResponseEntity<Movie>(movie, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<Movie>(HttpStatus.NOT_FOUND);
        }
    }


    // PUT CALLS
    @PutMapping("/updateMovie/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable Integer id){
        try {
            Movie existMovie = service.getMovie(id);
            service.addMovie(movie);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // DELETE CALLS
    @DeleteMapping("/deleteMovie/{id}")
    public void deleteMovie(@PathVariable Integer id){
        service.deleteMovie(id);
    }

}
