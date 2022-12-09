package com.kodilla.good.patterns.challenges.FlightFinder;

public class FlightRetriever {

    public static FlightRepository retrieve() {

        Flight flight1 = new Flight("KRK","WAW","WRO","8:10", "9:00", 1002);
        Flight flight2 = new Flight("KRK","WRO","WAW", "9:20", "11:20", 1290);
        Flight flight3 = new Flight("WAW","POZ","KRK","10:40", "11:55", 1012);
        Flight flight4 = new Flight("WAW","GDA",null,"9:55", "10:55", 1121);
        Flight flight5 = new Flight("GDA","RAD","WAW","13:45", "14:55", 1543);
        Flight flight6 = new Flight("LOD","RZE","GDA","14:30", "15:25", 1540);
        Flight flight7 = new Flight("LOD","KRK",null, "16:25", "17:30", 1070);
        Flight flight8 = new Flight("KRK","WRO","WAW", "17:35", "19:30", 1973);


        FlightRepository addingFlight = new FlightRepository();
            addingFlight.addFlight(flight1);
            addingFlight.addFlight(flight2);
            addingFlight.addFlight(flight3);
            addingFlight.addFlight(flight4);
            addingFlight.addFlight(flight5);
            addingFlight.addFlight(flight6);
            addingFlight.addFlight(flight7);
            addingFlight.addFlight(flight8);


        return addingFlight;



    }
}
