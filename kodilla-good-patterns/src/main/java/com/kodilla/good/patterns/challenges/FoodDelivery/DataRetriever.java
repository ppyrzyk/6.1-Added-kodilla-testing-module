package com.kodilla.good.patterns.challenges.FoodDelivery;

import java.time.LocalDate;

public class DataRetriever {

    public void retrieve() {

        ExtraFoodShop  supplierExtraFoodShop = new ExtraFoodShop("Extra Food Shop",
                "Aleja Pokoju 43, Kraków");
        HealthyShop supplierHealthyShop = new HealthyShop("Healthy Shop",
                "Wrocławska 32, Kraków");
        GlutenFreeShop supplierGlutenFreeShop = new GlutenFreeShop("Gluten Free Shop", "Poznanska 32, Kraków");

        Product product0 = new Product("Milk", "Dairy", 5,3);
        Product product1 = new Product("Sheep cheese", "Dairy", 4, 5);
        Product product2 = new Product("Creme", "Dairy", 6.5, 7);
        Product product3 = new Product("Butter", "Dairy", 7.3, 9);
        Product product4 = new Product("Milk w/o lactose", "Dairy", 10, 9);
        Product product5 = new Product("Buttermilk", "Dairy", 34, 5);
        Product product6 = new Product("Goats Cheese", "Dairy", 9.7, 6);
        Product product7 = new Product("Camembert", "Dairy", 6.5, 11);
        Product product8 = new Product("Original butter", "Dairy", 7.8, 65);
        Product product9 = new Product("Gluten free bread", "Bakery", 8.9, 9);

        AddProduct productsOfExtraFoodShop = new AddProduct();
        AddProduct productsOfHealthyShop = new AddProduct();
        AddProduct productsOfGlutenFreeShop = new AddProduct();

        productsOfExtraFoodShop.addNewProduct(product1);
        productsOfExtraFoodShop.addNewProduct(product2);
        productsOfExtraFoodShop.addNewProduct(product3);
//        productsOfExtraFoodShop.addNewProduct(product3);
        productsOfExtraFoodShop.addNewProduct(product4);
        productsOfExtraFoodShop.addNewProduct(product5);

        productsOfHealthyShop.addNewProduct(product6);
        productsOfHealthyShop.addNewProduct(product7);
        productsOfHealthyShop.addNewProduct(product8);
        productsOfHealthyShop.addNewProduct(product9);
        productsOfHealthyShop.addNewProduct(product4);

        productsOfGlutenFreeShop.addNewProduct(product3);
        productsOfGlutenFreeShop.addNewProduct(product4);
        productsOfGlutenFreeShop.addNewProduct(product2);
        productsOfGlutenFreeShop.addNewProduct(product1);
        productsOfGlutenFreeShop.addNewProduct(product6);

        AddSupplier supplier = new AddSupplier();

        supplier.addNewSupplier(supplierExtraFoodShop, productsOfExtraFoodShop);
        supplier.addNewSupplier(supplierHealthyShop, productsOfHealthyShop);
        supplier.addNewSupplier(supplierGlutenFreeShop, productsOfGlutenFreeShop);

        Order order = new Order( new User("Pawel","Paw","pawpaw","Wroclawska 4, Krakow",
                "paw@paw.pl"),
                LocalDate.of(2022,12,7), product4, 10 );

        Processor processor = new Processor(new MailInfo(), supplier);
        processor.process(order);

    }
}
