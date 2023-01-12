package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {
    @Test
    void testBigMacBuilder() {
//        Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .roll("corn")
                .burgers(3)
                .sauce("bbq")
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("tomato")
                .ingredient("pickles")
                .build();
//        When
        String typeOfRoll = bigmac.getRoll();
        int numberOfBurgers = bigmac.getBurgers();
        int numberOfIngredients = bigmac.getIngredients().size();
        String sauceKind = bigmac.getSauce();
//        Then
        assertEquals("corn", typeOfRoll);
        assertEquals(3, numberOfBurgers);
        assertEquals(4, numberOfIngredients);
        assertEquals("bbq", sauceKind);
    }
}
