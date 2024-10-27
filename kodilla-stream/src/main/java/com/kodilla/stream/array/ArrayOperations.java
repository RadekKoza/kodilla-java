package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .forEach(n -> System.out.print(n + ", "));

        OptionalDouble mean = IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .average();

        return mean.getAsDouble();
    }
}