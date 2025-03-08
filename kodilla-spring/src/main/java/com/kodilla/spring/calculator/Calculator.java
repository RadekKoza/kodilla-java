package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double sum = a + b;
        display.displayValue(sum);
        return sum;
    }

    public double sub(double a, double b) {
        double difference = a - b;
        display.displayValue(difference);
        return difference;
    }

    public double mul(double a, double b) {
        double product = a * b;
        display.displayValue(product);
        return product;
    }

    public double div(double a, double b) {
        double quotient = a / b;
        display.displayValue(quotient);
        return quotient;
    }
}
