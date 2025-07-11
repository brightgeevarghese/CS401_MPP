package lesson11.terminal_operations.reduce_demo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Tom", "Jack", "Bob", "Jain");
        String result = names.stream()
                .reduce("", (first, second) -> first + " " + second);
        System.out.println(result);
    }
}
