package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception{

    public RouteNotFoundException() {
        System.out.println("Not possible to land at this airport/ it does not exist");
    }
}
