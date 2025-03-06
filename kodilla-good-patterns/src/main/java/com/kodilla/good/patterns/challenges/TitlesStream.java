package com.kodilla.good.patterns.challenges;

public class TitlesStream {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(films -> films.getValue().stream())
                        .forEach(title -> System.out.print(title + "!"));
    }
}