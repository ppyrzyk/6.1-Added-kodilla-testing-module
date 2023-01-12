package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    void testCreatingNewPizza(){
//        Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("onion")
                .ingredient("ham")
                .ingredient("pineapple")
                .bottom("thin")
                .sauce("spicy")
                .ingredient("anchois")
                .build();
        System.out.println(pizza);;
//        When
        int howManyIngredients = pizza.getIngredients().size();
//        Then
        assertEquals(4, howManyIngredients);
    }
}
