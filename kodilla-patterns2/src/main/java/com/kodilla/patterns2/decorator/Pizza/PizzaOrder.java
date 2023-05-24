package com.kodilla.patterns2.decorator.Pizza;

import java.math.BigDecimal;

public interface PizzaOrder {

    BigDecimal getPrice();
    String getDecoration();
}