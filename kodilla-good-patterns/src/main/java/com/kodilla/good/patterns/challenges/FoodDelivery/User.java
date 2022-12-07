package com.kodilla.good.patterns.challenges.FoodDelivery;

public class User {

     private String firstName;
     private final String lastName;
     private final String logInID;
     private final String address;
     private final String email;

    public User(String firstName, String lastName, String logInID, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.logInID = logInID;
        this.address = address;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogInID() {
        return logInID;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
