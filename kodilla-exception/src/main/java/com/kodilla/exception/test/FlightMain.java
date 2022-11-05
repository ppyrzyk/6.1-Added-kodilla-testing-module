package com.kodilla.exception.test;

public class FlightMain {

    public static void main (String[] args){
        Flight flight = new Flight("gjb", "nbb");
        FlightFinder flightFinder= new FlightFinder();

        try{
            flightFinder.findFlight(flight);
        } catch (DepartureAirportException e) {
            System.out.println(e);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }finally{
            System.out.println("Thank you for using Flight Finder");
        }
    }
}
