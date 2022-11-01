package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(3.0, 1.5);
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException("Exception" + e);

        } finally {
            System.out.println("abc");
        }
    }
}

