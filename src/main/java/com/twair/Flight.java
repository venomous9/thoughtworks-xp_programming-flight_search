package com.twair;

public class Flight {
  private String source;
  private String destination;
  private Plane plane;
  private String number;
  private int seats;

  public Flight(String number, String source, String destination, Plane plane) throws Exception {
    this.source = source;
    this.destination = destination;
    this.plane = plane;
    this.number = number;
    this.seats = plane.getNumberOfSeats();
  }

  public String getSource() {
    return source;
  }

  public String getDestination() {
    return destination;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public int getSeats() {
    return seats;
  }

  public Plane getPlane() {
    return plane;
  }

  public String getNumber() {
    return number;
  }
}
