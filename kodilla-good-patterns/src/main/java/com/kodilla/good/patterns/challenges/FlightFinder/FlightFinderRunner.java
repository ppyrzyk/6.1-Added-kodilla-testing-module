package com.kodilla.good.patterns.challenges.FlightFinder;

public class FlightFinderRunner {

    public static void main(String[] args) {

        FlightRepository addingFlight = FlightRetriever.retrieve();

        FlightBrowser flightBrowser= new FlightBrowser(addingFlight.getListOfFlights());

        flightBrowser.browseByArrivalCity("WAW");
        flightBrowser.browseByDepartureCity("KRK");
        flightBrowser.browseByLayoverCity("KRK", "WAW", "WRO");
        flightBrowser.browseByLayoverCity2("KRK");;
    }
}