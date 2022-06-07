package com.company;

public class Traveler {
    private int seatNumber;
    private String name;
    private long phoneNumber;
    private String startPosition;
    private String destination;

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public int getSeatNumber() {
        return seatNumber;
    }

    public Traveler(int seatNumber, String name, long phoneNumber, String startPosition, String destination ) {
        this.seatNumber = seatNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.startPosition = startPosition;
        this.destination = destination;
    }
}
