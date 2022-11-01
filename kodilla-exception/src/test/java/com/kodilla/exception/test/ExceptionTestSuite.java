package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.testng.Assert.assertThrows;

public class ExceptionTestSuite {

    @Test
    void testProbablyIWillThrowException1() {
//        given
        SecondChallenge secondChallenge = new SecondChallenge();

//        when&then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 1.5));
    }

    @Test
    void testProbablyIWillThrowException2() {
//    given
        SecondChallenge secondChallenge = new SecondChallenge();
//    when&then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1));
    }
}
