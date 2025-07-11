package lesson11.reuse_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        //Another way of creating Stream
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//
//        Stream<String> stringStream = Stream.of("a", "b", "c", "d");


        //FN session
        List<String> stringList = Arrays.asList("a", "b", "c", "d");
        Stream<String> stringStream1 = stringList.stream();//create
        Stream<String> mappedStream = stringStream1.map(String::toUpperCase);

        mappedStream.forEach(System.out::println);
        System.out.println(mappedStream.count());
//        stringStream1.forEach(System.out::println);
    }
}
