package com.twair;

public class Plane {
    private String type;
    private int numberOfSeats;

    public Plane(String type, Integer numberOfSeats) {
        this.type = type;
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
