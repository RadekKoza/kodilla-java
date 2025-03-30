package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam Adamson");
        User john = new YGeneration("John Johnson");
        User  peter = new ZGeneration("Peter Peterson");
        //When
        String adamsPost = adam.sharePost();
        String johnsPost = john.sharePost();
        String petersPost = peter.sharePost();
        //Then
        assertEquals("Adam Adamson posts on Facebook", adamsPost);
        assertEquals("Adam Adamson posts on Twitter", johnsPost);
        assertEquals("Peter Peterson posts on Snapchat", petersPost);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User adam = new Millenials("Adam Adamson");
        //When
        String adamsPost1 = adam.sharePost();
        adam.setPublisher(new TwitterPublisher());
        System.out.println("Something has changed and now he posts on " + adam.publisher.share());
        //Then
        assertEquals("Twitter", adam.publisher.share());
    }

}