package lesson11.no_mutation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //immutable
        List<String> names = List.of(
                "Tom", "Jack", "Lily", "Bobby", "Nancy", "Nick"
        );
        //get a list of names in uppercase
        //without using Stream API
        //...


        //using Stream API : get a list of names in uppercase
        names.stream()//Stream<String>
                .map(data -> data.toUpperCase())//intermediate operation
                .forEach(System.out::println);//terminal operation

        System.out.println(names);

        //filter names start with N and convert it to uppercase
//        names.stream()
//                .filter(name -> name.startsWith("N"))
//                .map(name -> name.toUpperCase())
//                .forEach(System.out::println);
//
        //usage of peak
        names.stream()
        .filter(name -> name.startsWith("N"))//return Stream<String>
                .peek(data -> System.out.println("Peeked after filter: " + data))//return Stream<String>
        .map(name -> name.toUpperCase())//return Stream<String>
                .peek(data -> System.out.println("Peeked after map: " + data))//return Stream<String>
                .limit(1)//return Stream<String>
                .peek(data -> System.out.println("Peeked after limit: " + data))//return Stream<String>
        .forEach(System.out::println);
    }
}
