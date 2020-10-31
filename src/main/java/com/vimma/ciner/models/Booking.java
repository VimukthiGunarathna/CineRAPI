package com.vimma.ciner.models;

public class Booking {
    private int booking_id;
    private String booking_movie;
    private int movie_id;
    private int slot_id;

    public Booking(int booking_id, String booking_movie, int movie_id, int slot_id) {
        this.booking_id = booking_id;
        this.booking_movie = booking_movie;
        this.movie_id = movie_id;
        this.slot_id = slot_id;
    }
}
