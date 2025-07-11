package lesson13.boundless;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void copyFirstToEnd(List<?> genericList) {
//        genericList.add(genericList.get(0));
    }
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        copyFirstToEnd(integers);
    }
}
