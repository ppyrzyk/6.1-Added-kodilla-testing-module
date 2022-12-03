package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRetriever {

    public Order retrieve(){
        User user= new User("Pawel","Pawlowski", "PawPaw", "Pawel@Pawlowski.pl");
        Product product= new Product("Golden fork", "luxury utensil", 69.99);
        Order order= new Order(user, LocalDate.of( 2022,12,01), product);

        return order;
    }
}
