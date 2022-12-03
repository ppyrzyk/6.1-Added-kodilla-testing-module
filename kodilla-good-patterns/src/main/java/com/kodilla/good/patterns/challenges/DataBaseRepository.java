package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Locale;

public class DataBaseRepository implements SaleRepository{

    @Override
    public void createSoldProduct(User user, Product product, LocalDate saleDate) {
        System.out.println(product.getNameOfProduct().toUpperCase(Locale.ROOT) + " has been sold on " + saleDate + " ,purchased by " + user.getLogin());
        System.out.println("\n Contact the user via e-mail at " + user.getEmail()+ " .");
    }
}
