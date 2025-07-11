package lesson11.diff_ways_create_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //If a list is given => create Stream
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> integerStream = integers.stream();

        //If an array of Integer
        Integer[] integers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//Autoboxing happens
        Stream<Integer> integerStream1 = Stream.of(integers1);

        Employee[] employees = {
                new Employee(),
                new Employee()
        };
        Stream<Employee> employeeStream = Stream.of(employees);

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        IntStream and DoubleStream are Streams designed for primitive data, int and double
        IntStream intStream = Arrays.stream(ints);
        IntStream intStream1 = IntStream.of(10, 20, 30, 40);
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8);
    }
}

class Employee{}