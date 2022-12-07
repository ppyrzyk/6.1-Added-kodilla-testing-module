package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new EmailInfoService(), new ProductSoldService(),
                new DataBaseRepository());
        purchaseProcessor.process(order);

    }
}
