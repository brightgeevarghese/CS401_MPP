package lesson13.jdk_5_generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<Integer>();//In JDK1.5
        List<Integer> integerList = new ArrayList<>();//In JDK 1.6/jdk 1.7?
        integerList.add(10);
//        integerList.add(20.2);//compile time error
        integerList.add(35);
        System.out.println(integerList);
        int firstData = integerList.get(0);
        int secondData = integerList.get(1);
    }
}
