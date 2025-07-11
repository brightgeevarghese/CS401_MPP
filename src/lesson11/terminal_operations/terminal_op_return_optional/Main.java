package lesson11.terminal_operations.terminal_op_return_optional;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Tom", "Jack", "Bob", "Jain");
        names.stream()
                .filter(name -> name.startsWith("J"))//Jack, Jain
                .findFirst()
                .ifPresent(System.out::println);

        List<String> extractedContent = List.of("Today", ",",  "I",  "am", "going", "to", "speak", "about", "violence");

        //from our db
        List<String> sensitiveWords = List.of("hate", "violence", "murder");

        extractedContent.stream()
                .filter(word -> sensitiveWords.contains(word))
                .findFirst()
                .ifPresent(data -> {
                    //write code to raise the alert level
                    System.out.println("Alert level: " + data);
                });
    }
}
