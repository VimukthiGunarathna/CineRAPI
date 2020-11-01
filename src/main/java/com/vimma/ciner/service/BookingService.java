package com.vimma.ciner.service;

import com.vimma.ciner.controller.AddMovieRequest;
import com.vimma.ciner.models.Booking;
import com.vimma.ciner.models.Movie;
import com.vimma.ciner.models.TimeSlot;

import java.util.List;

public interface BookingService {
    void addBooking(Booking booking);
    List<Booking> getAllBookings();
    Booking getBookingById(Integer booking_id);
    void deleteBooking(int bookingId);
}
