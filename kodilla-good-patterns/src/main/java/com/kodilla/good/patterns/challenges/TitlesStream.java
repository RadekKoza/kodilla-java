package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class TitlesStream {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String filmString = movieStore.getMovies().entrySet().stream()
                .flatMap(films ->
                        films.getValue().stream()).collect(Collectors.joining("!"));
        System.out.println(filmString);
    }
}