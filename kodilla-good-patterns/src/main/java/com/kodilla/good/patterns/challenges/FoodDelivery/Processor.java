package com.kodilla.good.patterns.challenges.FoodDelivery;

public class Processor {

    private SaleInformation saleInformation;
    private AddSupplier addSupplier;

    public Processor(SaleInformation saleInformation, AddSupplier addSupplier) {
        this.saleInformation = saleInformation;
        this.addSupplier = addSupplier;
    }

    public void process(Order order){

        addSupplier.showAllProducts();
        boolean isAvailable = addSupplier.productAvailability(order.getProduct(), order.getPurchaseVolume());
        saleInformation.inform(order, isAvailable);
        if(!isAvailable) {
            System.out.println("The volume you have ordered is not available- there are " +
                    order.getProduct().getStockVolume() + " units of " + order.getProduct().getName()
                    + " in stock");
        }
    }
}
