package com.kodilla.patterns2.decorator.Pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(5);
    }

    @Override
    public String getDecoration() {
        return "Pizza decorations:";
    }
}