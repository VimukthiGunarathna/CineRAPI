package com.vimma.ciner.controller;

import com.vimma.ciner.service.BookingService;
import com.vimma.ciner.service.MovieService;
import com.vimma.ciner.service.MovieServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {

    Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);
    @Autowired
    BookingService service; // Service which will do all the data manipulations
}
