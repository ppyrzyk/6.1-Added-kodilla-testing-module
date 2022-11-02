package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airportAvailability = new HashMap<>();

        airportAvailability.put("JFK", true);
        airportAvailability.put("NWK", false);
        airportAvailability.put("CDG", true);
        airportAvailability.put("KRK", true);
        airportAvailability.put("WAW", true);
        airportAvailability.put("PYR", false);
        airportAvailability.put("RSW", false);
        airportAvailability.put("GAT", true);
        airportAvailability.put("HEA", false);


        if(airportAvailability.containsKey(flight.getDepartureAirport())){
            System.out.println("The flight will depart from " + flight.departureAirport);
        }else{
            System.out.println("Departure airport not found");
        }
        if (airportAvailability.containsKey(flight.getArrivalAirport())
                && airportAvailability.get(flight.arrivalAirport)) {
            System.out.println("Possible arrival at: " + flight.arrivalAirport );
        }
        else
            throw new RouteNotFoundException();
        }
}

