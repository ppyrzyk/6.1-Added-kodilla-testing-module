package com.kodilla.good.patterns.challenges;

public class Product {

    private String name;
    private String type;
    private Double price;

    public Product(String name, String type, Double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getNameOfProduct() {
        return name;
    }

    public String getTypeOfProduct() {
        return type;
    }

    public Double getPriceOfProduct() {
        return price;
    }
}
