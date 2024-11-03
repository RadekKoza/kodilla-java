package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Set<Country> countriesOfTheWorld = new HashSet<>();
        countriesOfTheWorld.add(new Country("India", new BigDecimal("1450935791"), "Asia"));
        countriesOfTheWorld.add(new Country("China", new BigDecimal("1419321278"), "Asia"));
        countriesOfTheWorld.add(new Country("United States", new BigDecimal("345426571"), "North America"));
        countriesOfTheWorld.add(new Country("Indonesia", new BigDecimal("283487931"), "Asia"));
        countriesOfTheWorld.add(new Country("Pakistan", new BigDecimal("251269164"), "Asia"));
        countriesOfTheWorld.add(new Country("Nigeria", new BigDecimal("232679478"), "Africa"));
        countriesOfTheWorld.add(new Country("Brazil", new BigDecimal("211998573"), "South America"));
        countriesOfTheWorld.add(new Country("Bangladesh", new BigDecimal("173562364"), "Asia"));
        countriesOfTheWorld.add(new Country("Russia", new BigDecimal("144820423"), "Asia"));
        countriesOfTheWorld.add(new Country("Ethiopia", new BigDecimal("132059767"), "Africa"));
        countriesOfTheWorld.add(new Country("Mexico", new BigDecimal("130861007"), "North America"));
        countriesOfTheWorld.add(new Country("Japan", new BigDecimal("123753041"), "Asia"));
        countriesOfTheWorld.add(new Country("Egypt", new BigDecimal("116538258"), "Africa"));
        countriesOfTheWorld.add(new Country("Philippines", new BigDecimal("115843670"), "Asia"));
        countriesOfTheWorld.add(new Country("DR Congo", new BigDecimal("109276265"), "Africa"));
        countriesOfTheWorld.add(new Country("Vietnam", new BigDecimal("100987686"), "Asia"));
        countriesOfTheWorld.add(new Country("Iran", new BigDecimal("91567738"), "Asia"));
        countriesOfTheWorld.add(new Country("Turkey", new BigDecimal("87473805"), "Asia"));
        countriesOfTheWorld.add(new Country("Germany", new BigDecimal("84552242"), "Europe"));
        countriesOfTheWorld.add(new Country("Thailand", new BigDecimal("71668011"), "Asia"));
        countriesOfTheWorld.add(new Country("United Kingdom", new BigDecimal("69138192"), "Europe"));
        countriesOfTheWorld.add(new Country("Tanzania", new BigDecimal("68560157"), "Africa"));
        countriesOfTheWorld.add(new Country("France", new BigDecimal("66548530"), "Europe"));
        countriesOfTheWorld.add(new Country("South Africa", new BigDecimal("64007187"), "Africa"));
        countriesOfTheWorld.add(new Country("Italy", new BigDecimal("59342867"), "Europe"));
        countriesOfTheWorld.add(new Country("Kenya", new BigDecimal("56432944"), "Africa"));
        countriesOfTheWorld.add(new Country("Myanmar", new BigDecimal("54500091"), "Asia"));
        countriesOfTheWorld.add(new Country("Colombia", new BigDecimal("52886363"), "South America"));
        countriesOfTheWorld.add(new Country("South Korea", new BigDecimal("51717590"), "Asia"));
        countriesOfTheWorld.add(new Country("Sudan", new BigDecimal("50448963"), "Africa"));
        countriesOfTheWorld.add(new Country("Uganda", new BigDecimal("50015092"), "Africa"));
        countriesOfTheWorld.add(new Country("Spain", new BigDecimal("47910526"), "Europe"));
        countriesOfTheWorld.add(new Country("Algeria", new BigDecimal("46814308"), "Africa"));
        countriesOfTheWorld.add(new Country("Iraq", new BigDecimal("46042015"), "Asia"));
        countriesOfTheWorld.add(new Country("Argentina", new BigDecimal("45696159"), "South America"));
        countriesOfTheWorld.add(new Country("Afghanistan", new BigDecimal("42647492"), "Asia"));
        countriesOfTheWorld.add(new Country("Yemen", new BigDecimal("40583164"), "Asia"));
        countriesOfTheWorld.add(new Country("Canada", new BigDecimal("39742430"), "North America"));
        countriesOfTheWorld.add(new Country("Poland", new BigDecimal("38539201"), "Europe"));

        Set<Country> countriesOfAfrica = new HashSet<>();
        countriesOfAfrica = countriesOfTheWorld.stream()
                .filter(country -> country.getContinentName() == "Africa")
                .collect(Collectors.toSet());
        Continent Africa = new Continent(countriesOfAfrica);

        Set<Country> countriesOfAsia = new HashSet<>();
        countriesOfAsia = countriesOfTheWorld.stream()
                .filter(country -> country.getContinentName() == "Asia")
                .collect(Collectors.toSet());
        Continent Asia = new Continent(countriesOfAsia);

        Set<Country> countriesOfEurope = new HashSet<>();
        countriesOfEurope = countriesOfTheWorld.stream()
                .filter(country -> country.getContinentName() == "Europe")
                .collect(Collectors.toSet());
        Continent Europe = new Continent(countriesOfEurope);

        Set<Country> countriesOfNorthAmerica = new HashSet<>();
        countriesOfNorthAmerica = countriesOfTheWorld.stream()
                .filter(country -> country.getContinentName() == "North America")
                .collect(Collectors.toSet());
        Continent North_America = new Continent(countriesOfNorthAmerica);

        Set<Country> countriesOfSouthAmerica = new HashSet<>();
        countriesOfSouthAmerica = countriesOfTheWorld.stream()
                .filter(country -> country.getContinentName() == "South America")
                .collect(Collectors.toSet());
        Continent South_America = new Continent(countriesOfSouthAmerica);

        Set<Continent> continents = new HashSet<>();
        continents.add(Africa);
        continents.add(Asia);
        continents.add(Europe);
        continents.add(North_America);
        continents.add(South_America);

        World world = new World(continents);

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();
        //Then
        assertEquals(new BigDecimal("6669656334"),worldPopulation);
    }
}