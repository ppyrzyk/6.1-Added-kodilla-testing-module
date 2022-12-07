package com.kodilla.good.patterns.challenges.FoodDelivery;

public class Product {

    private final String name ;
    private  final String category;
    private final double price;
    private int stockVolume;

    public Product(String name, String category, double price, int stockVolume) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockVolume = stockVolume;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStockVolume() {
        return stockVolume;
    }

    public void setVolumeAfterSale(int purchaseVolume) {
        this.stockVolume = stockVolume-purchaseVolume;
    }

    public int getVolume() {
        return stockVolume;
    }




    @Override
    public String toString(){
        return "Available " + stockVolume + " units of " + name + " from " +
                category + " category at a cost of " + price + " USD per unit.";
    }
}
