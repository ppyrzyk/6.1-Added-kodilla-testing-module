package com.kodilla.exception.test;

public class DepartureAirportException extends Exception{

    public DepartureAirportException(){
        System.out.println("Departure not possible");
    }
}
