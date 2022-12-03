package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class DataBaseRepository implements SaleRepository{

    @Override
    public void createSoldProduct(User user, Product product, LocalDate saleDate) {
        System.out.println(product.getNameOfProduct() + " has been sold on " + saleDate + " ,purchased by " + user.getLogin() +
                "\n Contact the user via e-mail at " + user.getEmail()+ " .");
    }
}
