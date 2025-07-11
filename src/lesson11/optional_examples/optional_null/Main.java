package lesson11.optional_examples.optional_null;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Optional<String> optionalS = Optional.of(null);//throws NullPointerException
//        System.out.println(optionalS);
        Optional<String> optionalS = Optional.ofNullable(null);
        System.out.println(optionalS);

        Optional<Integer> optionalI = Optional.ofNullable(10);
        System.out.println(optionalI);
        optionalI.ifPresent(System.out::println);

        System.out.println(
//                optionalS.orElseThrow()//throws NoSuchElementException
                optionalI.orElseThrow()
        );
    }
}
