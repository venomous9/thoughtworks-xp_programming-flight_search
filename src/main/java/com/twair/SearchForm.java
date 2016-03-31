package com.twair;

public class SearchForm {
  private String from;
  private String to;
  private String number;
  private int noOfSeats;

  public SearchForm() {
    noOfSeats = 1;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public int getNoOfSeats() {
    return noOfSeats;
  }

  public void setNoOfSeats(int noOfSeats) {
    this.noOfSeats = noOfSeats;
  }
}
