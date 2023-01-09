package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testSharingStrategies(){
//        Given
        User bob = new YGeneration("Bob White");
        User carl = new ZGeneration("Carl Red");
        User harry = new Millenials("Harry Black");
//        When
        String yGenSocialPublisher = bob.getSocialPublisher().share();
        String zGenSocialPublisher = carl.getSocialPublisher().share();
        String millenialsSocialPublisher = harry.getSocialPublisher().share();
//        Then
        assertEquals(" is using Twitter to communicate", yGenSocialPublisher);
        System.out.println(bob.getName() + yGenSocialPublisher);
        assertEquals(" is using Snapchat to communicate", zGenSocialPublisher);
        System.out.println(carl.getName() + zGenSocialPublisher);
        assertEquals(" is using Facebook to communicate", millenialsSocialPublisher);
        System.out.println(harry.getName() + millenialsSocialPublisher);
    }
    @Test
    void testIndividualStrategy(){
//        Given
        User paul = new ZGeneration("Paul Smith");
//        System.out.println(paul.getName() + paul.getSocialPublisher().share());
//        When
        paul.setSocialPublisher(new TwitterPublisher());
//        Then
        assertEquals(" is using Twitter to communicate", paul.getSocialPublisher().share());
        System.out.println(paul.getName() + paul.getSocialPublisher().share());
    }
    @Test
    void sharingPost() {
//            given
        User jan = new ZGeneration("Jan Addy");
//        when
        String post = jan.sharePost();
//        then
        assertEquals("post shared: is using Snapchat to communicate", post);
        System.out.println(jan.getName()+ "'s " + post);
    }
}
