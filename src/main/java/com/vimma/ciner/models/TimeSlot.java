package com.vimma.ciner.models;

public class TimeSlot {
    private int slot_id;
    private int movie_id;
    private String time_slot;

    public TimeSlot(int slot_id, String time_slot,int movie_id) {
        this.slot_id = slot_id;
        this.time_slot = time_slot;
        this.movie_id = movie_id;
    }

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public String getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(String time_slot) {
        this.time_slot = time_slot;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }
}
