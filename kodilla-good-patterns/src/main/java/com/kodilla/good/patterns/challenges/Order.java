package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Order {

    private User user;
    private LocalDate saleDate;
    private Product product;

    public Order(User user, LocalDate saleDate, Product product) {
        this.user = user;
        this.saleDate = saleDate;
        this.product = product;
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
}
