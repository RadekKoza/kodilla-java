package com.kodilla.patterns.strategy.social;

public final class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        this.publisher = new TwitterPublisher();
    }

}
