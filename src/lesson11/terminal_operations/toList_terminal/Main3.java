package lesson11.terminal_operations.toList_terminal;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main3 {
    public static void main(String[] args) {
        //create IntStream (a stream for primitive data)
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);
        System.out.println(intStream.sum());
        //intStream => already operated. So we cannot reuse
//        System.out.println(intStream.average());
        intStream = IntStream.range(1, 11);//1 to 10
        System.out.println(intStream.sum());

        intStream = IntStream.rangeClosed(1, 10);//from 1 to 10
        System.out.println(intStream.summaryStatistics());
    }
}
