package com.kodilla.stream.world;

import java.util.*;
import java.util.stream.Stream;

final public class Continent {

    private Set<Country> countries;

    public Continent(Set<Country> countries) {
        this.countries = countries;
    }

    public Set<Country> getCountries() {
        return countries;
    }

}




