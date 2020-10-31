package com.vimma.ciner.models;

public class TimeSlot {
    private int slot;
    private String time_slot;
    private int available_seats;

    public TimeSlot(int slot, String time_slot, int available_seats) {
        this.slot = slot;
        this.time_slot = time_slot;
        this.available_seats = available_seats;
    }
}
