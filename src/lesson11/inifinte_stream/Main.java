package lesson11.inifinte_stream;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {
    static int sum = 0;
    public static void main(String[] args) {
//        Stream.generate(new Supplier<Double>() {
//            @Override
//            public Double get() {
//                return Math.random();//call stock market price feed
//            }
//        })
//                .forEach(System.out::println);
        Stream.generate(() -> Math.random())
                .limit(10)//stateful operation
                .forEach(System.out::println);

        System.out.println("Another way to create infinite stream");
        Stream.iterate(12.05, aDouble -> aDouble + Math.random())
                .limit(5)
                .forEach(System.out::println);

        //find sum of n number

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        //Find the sum of n numbers using infinite stream
        Stream.iterate(0, n -> n <= 5, n -> n + 1)//0, 1, 2, 3, 4, 5, 6
//                .limit(10)
                .forEach(data -> {
                    sum += data;
                });
        System.out.println("Sum is " + sum);
        //Find the multiplication of n numbers using infinite stream


    }
}

class MyEmployee{}
