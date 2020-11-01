package com.vimma.ciner.models;

import javax.persistence.*;
import java.util.Arrays;
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movie_id;
    private String movie_name;
    private String movie_desc;
    private Integer available_seats;

    public Movie() {
    }

    public Movie(Integer movie_id, String movie_name, String movie_desc, Integer available_seats) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.movie_desc = movie_desc;
        this.available_seats = available_seats;
    }

    public Movie(String movie_name, String movie_desc, Integer available_seats) {
        this.movie_name = movie_name;
        this.movie_desc = movie_desc;
        this.available_seats = available_seats;
    }

    public Integer getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(Integer available_seats) {
        this.available_seats = available_seats;
    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_desc() {
        return movie_desc;
    }

    public void setMovie_desc(String movie_desc) {
        this.movie_desc = movie_desc;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", movie_name='" + movie_name + '\'' +
                ", movie_desc='" + movie_desc + '\'' +
                '}';
    }
}
