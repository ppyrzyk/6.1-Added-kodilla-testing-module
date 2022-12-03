package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(new EmailInfoService(), new ProductSoldService(),
                new DataBaseRepository());
        rentalProcessor.process(order);

    }
}
