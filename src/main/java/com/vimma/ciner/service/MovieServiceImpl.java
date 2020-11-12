package com.vimma.ciner.service;

import com.vimma.ciner.controller.AddMovieRequest;
import com.vimma.ciner.dao.BookingDao;
import com.vimma.ciner.dao.MovieDao;
import com.vimma.ciner.dao.TimeSlotDao;
import com.vimma.ciner.models.Movie;
import com.vimma.ciner.models.TimeSlot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{
    @Autowired
    MovieDao movieDao;
    @Autowired
    TimeSlotDao timeSlotDao;
    @Autowired
    BookingDao bookingDao;
    Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Override
    public void addMovie(AddMovieRequest movierequest) {
        Movie movie = movieDao.save(new Movie(
                movierequest.getMovie_name(),
                movierequest.getMovie_desc(),
                movierequest.getAvailable_seats()
        ));
        movierequest.getTime_slots()
                .forEach(timeSlot -> timeSlotDao.save(new TimeSlot(movie.getMovie_id(),timeSlot)));
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDao.findAll();
    }

    @Override
    public Movie getMovie(Integer id) {
        return movieDao.findById(id).get();
    }

    @Override
    public void updateMovie(AddMovieRequest updatedMovie, Movie existingMovie) {
        existingMovie.setMovie_name(updatedMovie.getMovie_name());
        existingMovie.setMovie_desc(updatedMovie.getMovie_desc());
        existingMovie.setAvailable_seats(updatedMovie.getAvailable_seats());
        updatedMovie.getTime_slots()
                .forEach(timeSlot -> timeSlotDao.save(new TimeSlot(existingMovie.getMovie_id(),timeSlot)));
    }

    @Override
    public void deleteMovie(int id) {
        movieDao.deleteById(id);
        timeSlotDao.findAll().forEach(timeSlot -> {
            if (timeSlot.getMovie_id() == id){
                timeSlotDao.deleteById(timeSlot.getSlot_id());
            }
        });
        bookingDao.findAll().forEach(booking -> {
            if(booking.getMovie_id() == id){
                bookingDao.deleteById(booking.getBooking_id());
            }
        });
    }

    @Override
    public List<TimeSlot> getTimeSlots(Integer movie_id) {
        ArrayList<TimeSlot> timeSlots = new ArrayList<TimeSlot>();

        timeSlotDao.findAll().forEach(timeSlot -> {
            if(timeSlot.getMovie_id() == movie_id) {
                timeSlots.add(timeSlot);
            }
        });
        return timeSlots;
    }

//    @Override
//    public List<Movie> getMoviesByName(String name) {
//        movieDao.
//                return null;
//    }

//    public User findByEmail(String email) {
//        User user = null;
//        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email=:email");
//        query.setParameter("email", email);
//        try {
//            user = (User) query.getSingleResult();
//        } catch (Exception e) {
//            // Handle exception
//        }
//        return user;
//    }
}
