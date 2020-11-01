package com.vimma.ciner.controller;

import java.util.List;

public class AddMovieRequest {

    private String movie_name;
    private String movie_desc;
    private Integer available_seats;
    private List<String> time_slots;

    public AddMovieRequest(String movie_name, String movie_desc, Integer available_seats, List<String> time_slots) {
        this.movie_name = movie_name;
        this.movie_desc = movie_desc;
        this.available_seats = available_seats;
        this.time_slots = time_slots;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_desc() {
        return movie_desc;
    }

    public void setMovie_desc(String movie_desc) {
        this.movie_desc = movie_desc;
    }

    public Integer getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(Integer available_seats) {
        this.available_seats = available_seats;
    }

    public List<String> getTime_slots() {
        return time_slots;
    }

    public void setTime_slots(List<String> time_slots) {
        this.time_slots = time_slots;
    }
}
