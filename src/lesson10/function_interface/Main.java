package lesson10.function_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> function = integer -> integer * 2;
        System.out.println(function.apply(2));

        BiFunction<Integer, Boolean, String> biFunction = (first, second) -> first + " " + second;
        System.out.println(biFunction.apply(2, true));
    }
}

interface TriFunction<A, B, C, Void> {
    void apply(A a, B b, C c);
}