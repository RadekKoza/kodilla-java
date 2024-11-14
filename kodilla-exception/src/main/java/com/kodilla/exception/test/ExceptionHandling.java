package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        double x = 1.8;
        double y = 2;
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(x, y);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("An error occured! " + e);
        }
        finally {
            System.out.println("Input numbers:\nx = " + x + "\ny = " + y );
        }
    }
}
