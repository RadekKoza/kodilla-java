package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Gdańsk", "Warsaw");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFundException e) {
            System.out.println("There is no such airport in the database.");
        } finally {
            System.out.println("Thank you for using Flight Finder.");
        }
    }
}
