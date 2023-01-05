package com.kodilla.patterns.strategy.social;

public final class SnapchatPublisher implements SocialPublisher{
    @Override
    public String share() {
        return " is using Snapchat to communicate";
    }
}
