package com.kodilla.patterns.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTestSuite {

    @Test
    void testDefaultInvestingStrategies(){

//        Given
        Customer Steven = new IndividualCustomer("Steven Links");
        Customer John = new IndividualYoungCustomer("John Hemerald");
        Customer Kodilla = new CorporateCustomer("Kodilla");
//        When
        String stevenShouldBuy = Steven.predict();
        System.out.println("Steven should:" + stevenShouldBuy);
        String johnShouldBuy = John.predict();
        System.out.println("John should buy:" + johnShouldBuy);
        String kodillaShouldBuy = Kodilla.predict();
        System.out.println("Kodilla should buy:" + kodillaShouldBuy);
//        Then
        assertEquals("[Conservative predictor] Buy debentures of XYZ", stevenShouldBuy);
        assertEquals("[Aggressive predictor] Buy stock of XYZ", johnShouldBuy);
        assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);
    }

    @Test
    void testIndividualInvestingSterategy(){

//        Given
        Customer Steven = new IndividualCustomer("Steven Links");

//        When
        String stevenShouldBuy = Steven.predict();
        System.out.println("Steven should:" + stevenShouldBuy);
        Steven.setBuyingStrategy(new AggressivePredictor());
        stevenShouldBuy = Steven.predict();
        System.out.println("Steven now should:" + stevenShouldBuy);
//        Then
        assertEquals("[Aggressive predictor] Buy stock of XYZ", stevenShouldBuy);
    }

}
