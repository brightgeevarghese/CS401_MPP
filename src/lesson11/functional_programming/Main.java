package lesson11.functional_programming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of(
                "beautiful", "life", "good", "challenges", "alright", "good day", "AN"
        );
        //count words : length > 5
        //1. create a Stream object
        Stream<String> stringStream = words.stream();
        //2. Filter words with length > 5
        Stream<String> filteredStream = stringStream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });
        //3.Count the elements in filtered stream
        long noOfWords = filteredStream.count();//4
        System.out.println(noOfWords);

        //functional programming
        long countWords = words.stream()
                .filter(s -> s.length() > 5)
                .count();
        System.out.println(countWords);

//        words.stream()
//                .filter(s -> {
//                    System.out.println(Thread.currentThread().getName());
//                    return s.length() > 5;
//                })
//                .count();
//        System.out.println(countWords);

        words.parallelStream()
                .filter(s -> {
                    System.out.println(Thread.currentThread().getName() + ": " + s);
                    return s.length() > 5;
                })
                .count();

    }
}
