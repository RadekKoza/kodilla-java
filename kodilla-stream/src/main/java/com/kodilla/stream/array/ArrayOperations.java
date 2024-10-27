package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        int start = 0;
        int end = numbers.length - 1;

        IntStream.of(numbers)
                .forEach(n -> System.out.print(n + ", "));

        OptionalDouble mean = IntStream.of(numbers)
                .average();

        return mean.getAsDouble();
    }
}