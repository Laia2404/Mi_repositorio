package com.mycompany.booking;

import java.util.List;

class Booking {
    private final List<Flight> flights;
    private final Passenger passenger;

    public Booking(List<Flight> flights, Passenger passenger) {
        this.flights = flights;
        this.passenger = passenger;
    }

    public void processBooking() {
        double total = 0;

        for (Flight flight : flights) {
            total += flight.getBasePrice();
        }

        if (passenger.isFrequentFlyer) {
            total *= 0.85; // 15% de descuento para viajeros frecuentes
        }

        if (passenger.hasDiscountCode) {
            total *= 0.90; // 10% de descuento adicional por código promocional
        }

        System.out.println("Total a pagar: $" + total);
        System.out.println("Reserva confirmada.");
    }

    public double calculateTotal() {
        double total = 0;

        for (Flight flight : flights) {
            total += flight.getBasePrice();
        }

        if (passenger.isFrequentFlyer) {
            total *= 0.85;
        }

        if (passenger.hasDiscountCode) {
            total *= 0.90;
        }

        return total;
    }
}
