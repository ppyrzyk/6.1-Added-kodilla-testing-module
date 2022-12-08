package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.Objects;

public class Flight {

    private String departureCity;
    private String arrivalCity;
    private String layOverCity;
    private String timeOfDeparture;
    private String timeOfArrival;
    private int flightNumber;



    public Flight(String departureCity, String arrivalCity,String layOverCity, String timeOfDeparture, String timeOfArrival, int flightNumber) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.layOverCity = layOverCity;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
        this.flightNumber = flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }
    public String getLayOverCity(){
        return layOverCity;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber && departureCity.equals(flight.departureCity) && arrivalCity.equals(flight.arrivalCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, arrivalCity, flightNumber);
    }

    @Override
    public String toString() {
        return "Flight number " + flightNumber + "," +
                " departing from " + departureCity + " at " + timeOfDeparture +
                ", arriving in " + arrivalCity + " at " + timeOfArrival;
    }
}
