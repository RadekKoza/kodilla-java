package com.kodilla.patterns.strategy.social;

public sealed class User
        permits Millenials, YGeneration, ZGeneration {

    private final String name;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }

    public String sharePost() {
        String post = name + " posts on " + publisher.share();
        System.out.println(post);
        return post;
    }
}