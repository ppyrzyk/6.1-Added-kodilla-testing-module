package com.kodilla.good.patterns.challenges.FoodDelivery;

import java.time.LocalDate;

public class Order {

    private User user;
    private LocalDate saleDate;
    private Product product;
    private int purchaseVolume;

    public Order(User user, LocalDate saleDate, Product product, int purchaseVolume) {
        this.user = user;
        this.saleDate = saleDate;
        this.product = product;
        this.purchaseVolume = purchaseVolume;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public Product getProduct() {
        return product;
    }

    public int getPurchaseVolume() {
        return purchaseVolume;
    }
}
