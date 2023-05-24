package com.kodilla.patterns2.decorator.Pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = pizzaOrder.getPrice();
        // Then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        String description = pizzaOrder.getDecoration();
        // Then
        assertEquals("Pizza decorations:", description);
    }

    @Test
    public void testPizzaOrderWith2DecorationsGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getPrice();
        // Then
        assertEquals(new BigDecimal(9), calculatedCost);
    }

    @Test
    public void testPizzaOrderwith2DecorationsGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDecoration();
        // Then
        assertEquals("Pizza decorations: salami, olives,", description);
    }

    @Test
    public void testPizzaOrderWith4DecorationsGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);
        pizzaOrder = new MozarelaDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getPrice();
        // Then
        assertEquals(new BigDecimal(11), calculatedCost);
    }

    @Test
    public void testPizzaOrderwith4DecorationsGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);
        pizzaOrder = new MozarelaDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDecoration();
        // Then
        assertEquals("Pizza decorations: salami, olives, mozarela,", description);
    }
}