package com.mycompany.booking;

import java.util.List;

/**
 *
 * @author Laia
 */
class Bookingrefactorizado {
    private final List<Flight> flights;
    private final Passenger passenger;

    public Bookingrefactorizado(List<Flight> flights, Passenger passenger) {
        this.flights = flights;
        this.passenger = passenger;
    }

    public void processBooking() {
        double total = calculateTotalAmount();
        System.out.println("Total a pagar: $" + total);
        System.out.println("Reserva confirmada.");
    }

    public double calculateTotal() {
        return calculateTotalAmount();
    }

    // Método extraído que centraliza la lógica de cálculo
    private double calculateTotalAmount() {
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

        return total;
    }
}
