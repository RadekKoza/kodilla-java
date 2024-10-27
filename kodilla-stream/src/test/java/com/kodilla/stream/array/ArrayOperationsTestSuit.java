package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuit {

    @Test
    void testGetAverage() {
        int[] numbers = new int[]{4,1,15,12,23,54,123,34,33,24,53,34,23,12,21,32,43,54,65,76};
        double mean = ArrayOperations.getAverage(numbers);
        assertEquals(36.8, mean, 0.01);
    }

}