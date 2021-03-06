package com.vimma.ciner.controller;

import com.vimma.ciner.models.Booking;
import com.vimma.ciner.models.Movie;
import com.vimma.ciner.service.BookingService;
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
public class BookingController {

    Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);
    @Autowired
    BookingService service; // Service which will do all the data manipulations

    // POST CALLS
    @PostMapping("/bookMovie")
    public ResponseEntity<Movie> addBooking(@RequestBody Booking booking){
        try {
            service.addBooking(booking);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }

    // GET CALLS
    @GetMapping("/getAllBookings")
    public List<Booking> getAllBookings() {
        return  service.getAllBookings();
    }

    @GetMapping("/getNumberOfBookings/{id}")
    public ResponseEntity<TotalBookingsResponse> getNumberOfBookings(@PathVariable("id") int id ) {
        try {
            TotalBookingsResponse totalBookings = service.getNumberOfBookings(id);
            return new ResponseEntity<TotalBookingsResponse>(totalBookings, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<TotalBookingsResponse>(HttpStatus.NOT_FOUND);
        }
    }

    // DELETE CALLS
    @DeleteMapping("/deleteBooking/{id}")
    public ResponseEntity<Booking> deleteBooking(@PathVariable("id") int id){
        try {
            service.deleteBooking(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<Booking>(HttpStatus.NOT_FOUND);
        }
    }
}
