package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("London", false);
        airports.put("Paris", true);
        airports.put("Oslo", true);

        if (!airports.containsKey(flight.getArrivalAirport()))
            throw new RouteNotFundException();

        else if (airports.get(flight.getArrivalAirport()))
            System.out.println("Flight " + flight.getDepartureAirport() + " - "
                    + flight.getArrivalAirport() + " is available.");

        else
            System.out.println("Airport " + flight.getArrivalAirport() + " is unavailable.");
    }
}