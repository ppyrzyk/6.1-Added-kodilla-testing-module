package com.kodilla.exception.test;

public class FlightMain {

    public static void main (String[] args){
        Flight flight = new Flight("JFK", "HEA");
        FlightFinder flightFinder= new FlightFinder();

        try{
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
