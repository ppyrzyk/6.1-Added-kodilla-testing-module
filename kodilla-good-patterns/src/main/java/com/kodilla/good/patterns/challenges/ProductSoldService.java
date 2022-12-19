package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductSoldService implements SaleService{
    @Override
    public boolean sale(User user, Product product, LocalDate saleDate) {
        System.out.println(product.getNameOfProduct() + " has been ordered from the " + product.getTypeOfProduct() + " category, for the price of "
                            + product.getPriceOfProduct() + "USD, on the " + saleDate + " , it is purchased by " + user.getLogin() + " user!! Enjoy!!");
        return true;
    }
}
