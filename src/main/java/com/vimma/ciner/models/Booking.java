package com.vimma.ciner.models;

public class Booking {
    private int booking_id;
    private int movie_id;
    private int slot_id;
    private int customer_id;

    public Booking(int booking_id, int movie_id, int slot_id, int customer_id) {
        this.booking_id = booking_id;
        this.movie_id = movie_id;
        this.slot_id = slot_id;
        this.customer_id = customer_id;
    }
}
