package com.vimma.ciner.dao;

import com.vimma.ciner.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking,Integer> {
}
