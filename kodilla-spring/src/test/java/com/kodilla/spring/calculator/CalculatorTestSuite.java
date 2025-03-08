package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double a = 4.5;
        double b = 2.5;
        //Then
        Assertions.assertEquals(7.0, calculator.add(a, b));
        Assertions.assertEquals(2.0, calculator.sub(a, b));
        Assertions.assertEquals(11.25, calculator.mul(a, b));
        Assertions.assertEquals(1.8, calculator.div(a, b));
    }
}
