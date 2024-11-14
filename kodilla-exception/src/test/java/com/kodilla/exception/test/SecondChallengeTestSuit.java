package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuit {

 @Test
 void testWillThrowException1() {
     // given
     SecondChallenge secondChallenge = new SecondChallenge();
     // when
     double x = 2;
     double y = 2;
     // then
     assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
 }

    @Test
    void testWillThrowException2() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when
        double x = 1.5;
        double y = 1.5;
        // then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void testIWillNotThrowException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when
        double x = 1;
        double y = 1;
        // then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x, y));
    }
}
