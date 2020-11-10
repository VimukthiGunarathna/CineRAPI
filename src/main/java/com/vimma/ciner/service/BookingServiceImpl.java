package com.vimma.ciner.service;

import com.vimma.ciner.controller.TotalBookingsResponse;
import com.vimma.ciner.dao.BookingDao;
import com.vimma.ciner.dao.MovieDao;
import com.vimma.ciner.dao.TimeSlotDao;
import com.vimma.ciner.models.Booking;
import com.vimma.ciner.models.Movie;
import com.vimma.ciner.models.TimeSlot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingDao bookingDao;
    @Autowired
    MovieDao movieDao;
    @Autowired
    TimeSlotDao timeSlotDao;
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
    @Override
    public TotalBookingsResponse getNumberOfBookings(Integer slotId){
        TimeSlot slot = timeSlotDao.findById(slotId).get();
        Movie movie = movieDao.findById(slot.getMovie_id()).get();
        Integer totalBookings =0;
        totalBookings += bookingDao.findAll().stream()
                .filter(booking -> booking.getMovie_id() == movie.getMovie_id() && booking.getSlot_id() == slotId)
                .mapToInt(Booking::getTickets).sum();
        if (totalBookings>=movie.getAvailable_seats()){
            TotalBookingsResponse response = new TotalBookingsResponse(totalBookings,true);
            return response;
        }else{
            TotalBookingsResponse response = new TotalBookingsResponse(totalBookings,false);
            return response;
        }
    }

}
