package com.kodilla.good.patterns.challenges.FoodDelivery;

import java.util.HashMap;
import java.util.Map;

public class AddSupplier {

    Map<SupplierProcess, AddProduct> addSupplier = new HashMap<SupplierProcess, AddProduct>();

    public void addNewSupplier(SupplierProcess supplier, AddProduct addProduct) {
        addSupplier.put(supplier, addProduct );
    }

    public void showAllProducts(){
        for(Map.Entry<SupplierProcess,AddProduct> current : addSupplier.entrySet()) {
            System.out.println(current.getKey());
            for(Product currentProduct: current.getValue().getListOfProducts()) {
                if (currentProduct.getVolume() > 0)
                    System.out.println(currentProduct.toString());
            }
        }
    }
    public boolean productAvailability(Product product, int purchaseVolume) {
            for(Map.Entry<SupplierProcess,AddProduct> current : addSupplier.entrySet()) {
                for(Product currentProduct : current.getValue().getListOfProducts()) {
                    if(currentProduct.equals(product) && currentProduct.getVolume() > purchaseVolume) {
                        product.setVolumeAfterSale(purchaseVolume);
                        return true;
                    }
                }
            }
            return false;
        }
    }

