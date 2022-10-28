package com.kodilla.lambda.stream.array;

import java.util.List;
import java.util.stream.IntStream;


public interface ArrayOperations {

    static double getAverage(List<Integer> numbers) {
        IntStream.range(0, numbers.size())
                .map(n-> numbers.get(n))
                .forEach(System.out::println);
        double average = IntStream.range(0, numbers.size())
                .mapToDouble(n-> numbers.get(n))
                .average()
                .getAsDouble();
        System.out.println("The Average is " + average);
        return average;
    }
}
