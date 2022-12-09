package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {

    private Set<Flight> listOfFlights = new HashSet<>();

    public boolean addFlight(Flight flight){
        listOfFlights.add(flight);
        return true;
    }

    public Set<Flight> getListOfFlights() {
        return listOfFlights;
    }
}
