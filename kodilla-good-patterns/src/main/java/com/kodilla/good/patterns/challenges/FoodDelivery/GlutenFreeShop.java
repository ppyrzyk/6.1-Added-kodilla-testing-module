package com.kodilla.good.patterns.challenges.FoodDelivery;

public class GlutenFreeShop implements SupplierProcess {

    private String name;
    private String suppliersAddress;

    public GlutenFreeShop(String name, String suppliersAddress) {
        this.name = name;
        this.suppliersAddress = suppliersAddress;
    }
    @Override
    public void process(Product product, int volumeOfPurchase) {
        System.out.print("Product" + product.getName() + "  is being packaged to be sent");

    }

    public String getName() {
        return name;
    }

    public String getSuppliersAddress() {
        return suppliersAddress;
    }

    @Override
    public String toString() {
        return "Suppliers name" + name +
                " located in: " + suppliersAddress;
    }
}