package com.vimma.ciner.controller;

import com.vimma.ciner.models.Movie;
import com.vimma.ciner.models.TimeSlot;
import com.vimma.ciner.service.MovieService;
import com.vimma.ciner.service.MovieServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MovieController {
    Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);
    @Autowired
    MovieService service; // Service which will do all the data manipulations

    // POST CALLS
    @PostMapping("/addMovie")
    public ResponseEntity<Movie> addMovie(@RequestBody AddMovieRequest movie){
        try {
            log.info("movie",movie.toString());
            service.addMovie(movie);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }

    }

    // GET CALLS
    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies() {
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

    @GetMapping("/getTimeSlots/{id}")
    public List<TimeSlot> getTimeSlotsByMovieId(@PathVariable("id") int movie_id) {
        return service.getTimeSlots(movie_id);
    }


    // PUT CALLS
    @PutMapping("/updateMovie/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody AddMovieRequest movie, @PathVariable Integer id){
        try {
            Movie existingMovie = service.getMovie(id);
            service.updateMovie(movie,existingMovie);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // DELETE CALLS
    @DeleteMapping("/deleteMovie/{id}")
    public void deleteMovie(@PathVariable("id") int id){
        service.deleteMovie(id);
    }

}
