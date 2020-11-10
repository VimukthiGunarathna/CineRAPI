package com.vimma.ciner.controller;

public class TotalBookingsResponse {
    private Integer totalBookings;
    private boolean houseFull;

    public TotalBookingsResponse(Integer totalBookings, boolean houseFull) {
        this.totalBookings = totalBookings;
        this.houseFull = houseFull;
    }

    public Integer getTotalBookings() {
        return totalBookings;
    }

    public void setTotalBookings(Integer totalBookings) {
        this.totalBookings = totalBookings;
    }

    public boolean isHouseFull() {
        return houseFull;
    }

    public void setHouseFull(boolean houseFull) {
        this.houseFull = houseFull;
    }
}
