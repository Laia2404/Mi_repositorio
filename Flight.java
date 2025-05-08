package com.mycompany.booking;

class Flight {
    private final double basePrice;

    public Flight(String destination, double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
}