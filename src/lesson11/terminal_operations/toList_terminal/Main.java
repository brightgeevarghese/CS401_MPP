package lesson11.terminal_operations.toList_terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);
        //find even numbers and multiply by 2
        List<Integer> processedEvenNumbers = integers.stream()
                .filter(data -> data % 2 == 0)//intermediate opn
                .map(data -> data * 2)//intermediate opn
                .toList();//terminal operation
        System.out.println(processedEvenNumbers);

        //collect the processed numbers in a list
        List<Integer> processedOddNumbers = integers.stream()
                .filter(data -> data % 2 != 0)
                .map(data -> data * 2)
                .collect(Collectors.toList());

        Set<Integer> integerSet = integers.stream()
                .filter(data -> data % 2 == 0)
                .collect(Collectors.toUnmodifiableSet());

        System.out.println(integerSet);
    }
}
