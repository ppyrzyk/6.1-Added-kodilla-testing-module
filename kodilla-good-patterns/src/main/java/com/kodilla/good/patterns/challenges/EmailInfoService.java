package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class EmailInfoService implements InformationService{
    @Override
    public void information(User user, Product product, LocalDate saleDate, boolean isSold) {
        if (isSold){
            System.out.println("Dear " + user.getName() + "." + "\n On the date: "+ saleDate + " you have purchased a " + product.getNameOfProduct() + " at "
                    + product.getPriceOfProduct()+ " USD" + ".We hope you will enjoy the " + product.getNameOfProduct() +
                    " from our " + product.getTypeOfProduct() + " category");
        }else {
            System.out.println("Dear " + user.getName() + " ,we are sorry but the purchase of the " + product.getNameOfProduct() + " could not be finalized. Please try again later. " +
                    " or contact our customer service");
        }
    }
}
