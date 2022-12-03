package com.kodilla.good.patterns.challenges;

public class User {

    private String name;
    private String lastName;
    private String login;
    private String email;

    public User(String name, String lastName, String login, String email) {
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
