package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

@DisplayName("Calculating world's population")
public class WorldTestSuite {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Calculation is starting");
    }
    @BeforeEach
    void setup() {
        System.out.println("Off we go");
    }
    @DisplayName("Calculating the population ")
    @Test
    void testGetPeopleQuantity() {
//        Given
        World world = new World();
        Continent continentAsia = new Continent("Asia");
        Continent continentAfrica = new Continent("Africa");
        world.addContinents(continentAfrica);
        world.addContinents(continentAsia);

        BigDecimal nigeriaPopulation = new BigDecimal("343567890");
        BigDecimal algeriaPopulation = new BigDecimal("876543243");
        BigDecimal southAfricaPopulation = new BigDecimal("76523458");
        BigDecimal zimbabwePopulation = new BigDecimal("648763458");

        Country Nigeria =  new Country("Nigeria", nigeriaPopulation);
        Country Algeria = new Country("Algeria", algeriaPopulation);
        Country SouthAfrica = new Country("SouthAfrica", southAfricaPopulation);
        Country Zimbabwe = new Country("Zimbabwe", zimbabwePopulation);

        BigDecimal chinaPopulation = new BigDecimal("1245678553");
        BigDecimal southKoreaPopulation = new BigDecimal("34678633");
        BigDecimal vietnamPopulation = new BigDecimal("4678985");
        BigDecimal singaporePopulation = new BigDecimal("9870002");

        Country China = new Country("China", chinaPopulation);
        Country SouthKorea = new Country("SouthKorea", southKoreaPopulation);
        Country Vietnam = new Country("Vietnam", vietnamPopulation);
        Country Singapore = new Country("Singapore", singaporePopulation);

        continentAfrica.addCountry(Nigeria);
        continentAfrica.addCountry(Algeria);
        continentAfrica.addCountry(SouthAfrica);
        continentAfrica.addCountry(Zimbabwe);

        continentAsia.addCountry(China);
        continentAsia.addCountry(SouthKorea);
        continentAsia.addCountry(Vietnam);
        continentAsia.addCountry(Singapore);
//        When
        BigDecimal worldPopulation = world.getPopulation();
//        Then
        BigDecimal current = new BigDecimal("3240304222");
        Assertions.assertEquals(current,worldPopulation);


    }
}
