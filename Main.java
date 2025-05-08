package com.mycompany.booking;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("María Lourdes", true, true);
        List<Flight> flights = List.of(
                new Flight("Madrid", 200),
                new Flight("París", 300)
        );

        Booking booking = new Booking(flights, passenger);
        booking.processBooking();
    }
}