package lesson10.functional_interface;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ListInfo listInfo = new ListInfo();
        listInfo.addNumber(10);
        listInfo.addNumber(20);
        listInfo.addNumber(30);
        //print it
        for (int i = 0; i < listInfo.getSize(); i++) {
            //...
        }

        List<Integer> integers = listInfo.getList();
        System.out.println(integers);

        //one more way, by using Consumer
        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        //apply lambda for functional interface
        Consumer<Integer> consumer = integer -> System.out.println(integer);
        integers.forEach(consumer);
    }
}
