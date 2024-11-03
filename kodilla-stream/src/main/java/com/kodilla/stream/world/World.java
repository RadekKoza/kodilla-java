package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class World {

    public Set<Continent> continents = new HashSet<>();

    public World(Set<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity()  {

        BigDecimal worldPopulation;
        worldPopulation = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return worldPopulation;
    }
}