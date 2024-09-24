package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //test kalkulatora
        Calculator calculator = new Calculator();

        int sum = calculator.add(2,5);
        if (sum == 7) {
            System.out.println("test dodawania OK");
        } else {
            System.out.println("Error! Błąd dodawania.");
        }

        int difference = calculator.subtract(7,4);
        if (difference == 3) {
            System.out.println("test odejmowania OK");
        } else {
            System.out.println("Error! Błąd odejmowania.");
        }
    }
}