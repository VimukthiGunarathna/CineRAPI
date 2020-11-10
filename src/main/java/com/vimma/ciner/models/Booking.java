package com.vimma.ciner.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;
    private int movie_id;
    private int slot_id;
    private int customer_id;
    private int tickets;

    public Booking(int booking_id, int movie_id, int slot_id, int customer_id, int tickets) {
        this.booking_id = booking_id;
        this.movie_id = movie_id;
        this.slot_id = slot_id;
        this.customer_id = customer_id;
        this.tickets = tickets;
    }

    public Booking(int movie_id, int slot_id, int customer_id, int tickets) {
        this.movie_id = movie_id;
        this.slot_id = slot_id;
        this.customer_id = customer_id;
        this.tickets = tickets;
    }

    public Booking() {
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
