package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightBrowser {

    private Set<Flight> listOfFlights;

    public FlightBrowser(Set<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }
     public void browseByDepartureCity(String departureCityName) {
         System.out.println("List of flights departing from  ".toUpperCase() + departureCityName);
                 listOfFlights.stream()
                         .filter(f -> f.getDepartureCity().equals(departureCityName))
                         .map(f -> f.toString())
                         .forEach(System.out::println);
         System.out.println();
    }
    public void browseByArrivalCity(String arrivalCityName) {
        System.out.println("List of flights arriving at ".toUpperCase(Locale.ROOT) + arrivalCityName);
                 listOfFlights.stream()
                         .filter(f->f.getArrivalCity().equals(arrivalCityName))
                         .map(f->f.toString())
                         .forEach(System.out::println);
        System.out.println();
    }
    public void browseByLayoverCity(String departureCityName,String layoverCityName, String arrivalCityName){
        System.out.println("List of flights departing from ".toUpperCase() + departureCityName + " arriving in ".toUpperCase() + arrivalCityName +
                " with a layover at ".toUpperCase() + layoverCityName);
        List<Flight> listOfLayoverFlights = listOfFlights.stream()
                .filter(f->f.getDepartureCity().equals(departureCityName) && f.getArrivalCity().equals(arrivalCityName) &&
                        f.getLayOverCity().equals(layoverCityName))
                .collect(Collectors.toList());
        listOfLayoverFlights.stream()
                .forEach(System.out::println);
        System.out.println();
    }
    public void browseByLayoverCity2(String layOverCityName) {
        System.out.println("List of flights with a layover in " + layOverCityName);
            listOfFlights.stream()
                    .filter(f->f.getLayOverCity().equals(layOverCityName))
                    .map(f->f.toString())
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        System.out.println();;
    }
}
