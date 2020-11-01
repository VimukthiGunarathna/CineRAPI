package com.vimma.ciner.service;

import com.vimma.ciner.controller.AddMovieRequest;
import com.vimma.ciner.dao.BookingDao;
import com.vimma.ciner.dao.MovieDao;
import com.vimma.ciner.dao.TimeSlotDao;
import com.vimma.ciner.models.Booking;
import com.vimma.ciner.models.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingDao bookingDao;
    Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Override
    public void addBooking(Booking booking) {
        bookingDao.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingDao.findAll();
    }

    @Override
    public Booking getBookingById(Integer bookingId) {
        return bookingDao.findById(bookingId).get();
    }

    @Override
    public void deleteBooking(int bookingId) {
        bookingDao.deleteById(bookingId);
    }
}
