package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final String name;
    private final BigDecimal populationSize;
    private final String continentName;

    public Country(String name, BigDecimal populationSize, String continentName) {
        this.name = name;
        this.populationSize = populationSize;
        this.continentName = continentName;
    }

    public BigDecimal getPeopleQuantity() {
        return populationSize;
    }

    public String getContinentName() {
        return continentName;
    }
}