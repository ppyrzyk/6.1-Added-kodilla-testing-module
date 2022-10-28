package com.kodilla.lambda.stream.world;

import java.math.BigDecimal;

public final class Country {

    final String name;
    final BigDecimal population;

    public Country(final String name,final BigDecimal population) {
        this.name = name;
        this.population = population;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

}
