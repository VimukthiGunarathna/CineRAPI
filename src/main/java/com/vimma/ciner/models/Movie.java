package com.vimma.ciner.models;

public class Movie {
    private int movie_id;
    private String movie_desc;
    private TimeSlot slots[];

    public Movie(int movie_id, String movie_desc, TimeSlot[] slots) {
        this.movie_id = movie_id;
        this.movie_desc = movie_desc;
        this.slots = slots;
    }
}
