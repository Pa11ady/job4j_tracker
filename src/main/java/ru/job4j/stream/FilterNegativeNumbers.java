package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, -4, 54, 43, -6, 0, 10);
        List<Integer> positive = numbers.stream().filter((x) -> x > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
