package com.kodilla.patterns2.decorator.Pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaOrderDecorator{
    public SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
        @Override
        public BigDecimal getPrice() {
            return super.getPrice().add(new BigDecimal(2));
        }

        @Override
        public String getDecoration() {
            return super.getDecoration() + " salami,";
        }
}
