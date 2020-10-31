package com.vimma.ciner.controller;

import com.vimma.ciner.service.MovieService;
import com.vimma.ciner.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    @Autowired
    MovieService service;
    @GetMapping("/getMovies")
    String getMovies(@PathVariable String name) {
        return  service.getMovie();
    }
    @PostMapping
    String addMovies(){

    }
    @PutMapping
    String addMovies(){

    }
    @DeleteMapping
    String addMovies(){

    }

}
