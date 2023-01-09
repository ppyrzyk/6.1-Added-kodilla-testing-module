package com.kodilla.patterns.strategy.social;

public sealed class User permits YGeneration, ZGeneration, Millenials {

    private final String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return "post shared:" + socialPublisher.share();
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }


    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
