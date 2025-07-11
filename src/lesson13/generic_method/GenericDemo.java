package lesson13.generic_method;

import java.util.List;

public class GenericDemo {
    //...data and methods

    public static <T>void print(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    //The scope of type variable, T is only for the particular method
    public static <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        print(new Integer[]{1, 2, 3});//T acts as Integer
        print(new Double[]{1.0, 1.1, 1.2});//T acts as Double

        printList(List.of("Tom", "Jack", "Bob"));
        printList(List.of(1, 2, 3));
    }
}
