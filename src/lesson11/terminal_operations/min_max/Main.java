package lesson11.terminal_operations.min_max;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(intStream.min());
//        System.out.println(intStream.max());
        System.out.println(
                IntStream.range(1, 11)
                        .sum()
        );
        System.out.println(
                IntStream.rangeClosed(1, 10)
                        .min()
        );
        System.out.println(
                IntStream.rangeClosed(1, 10)
                        .max()
        );
        System.out.println(
                IntStream.rangeClosed(1, 10)
                        .average()
        );

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(
                integers.stream()
                        .mapToInt(Integer::intValue)
                        .sum()
        );

        integers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        integers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        integers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);

        OptionalInt minned = integers.stream()
                .mapToInt(Integer::intValue)
                .min();
        if (minned.isPresent()) {
            System.out.println("Min: " + minned.getAsInt());
        }

        List<String> words = List.of("life", "could", "be", "better");
        words.stream()
                .mapToInt(String::length)
                .min()
                .ifPresent(System.out::println);
    }
}
