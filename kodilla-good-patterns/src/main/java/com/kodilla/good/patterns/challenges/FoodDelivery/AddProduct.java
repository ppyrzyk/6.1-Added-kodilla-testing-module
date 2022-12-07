package com.kodilla.good.patterns.challenges.FoodDelivery;

import java.util.ArrayList;
import java.util.List;

public class AddProduct {

    private final List<Product> listOfProducts = new ArrayList<Product>();

    boolean addNewProduct(Product product) {
        if (listOfProducts.contains(product)) {
            System.out.println("Error, this product already exists in the list");
            return false;
        } else {
            listOfProducts.add(product);
            return true;
        }
    }
    public List<Product> getListOfProducts(){
        return listOfProducts;
    }

}

