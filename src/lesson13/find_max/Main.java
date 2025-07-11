package lesson13.find_max;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

     public static <T extends Comparable<? super T>> T findMax(List<T> list) {
        T max = list.getFirst();//list.get(0);
        for (T i : list) {
            if (i.compareTo(max) > 0) {//Is i greater than max?
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(List.of(1, 2, 3, 4, 5)));//5 => Integer implements Comparable<Integer>
        System.out.println(findMax(List.of(1.0, 2.0, 4.4, 5.5)));//5.5 => Double implements Comparable<Double>
        System.out.println(findMax(List.of("a", "b", "c", "d")));//d =? String implements Comparable<String>
        //👇gives compile time error since Integer implements Comparable<Integer>,
        // we cannot compare Integer obj with a Double obj
//        System.out.println(findMax(List.of(1, 2.0)));
//        List<LocalDate> localDates = List.of(LocalDate.now(), LocalDate.now().plusDays(1));
        List<LocalDate> localDates = List.of(
                LocalDate.of(2025, 7, 9),
                LocalDate.of(2025, 7, 10)
        );
        System.out.println(findMax(localDates));//error due to => LocalDate does not implement Comparable<LocalDate>
        //However, LocalDate implements ChronoLocalDate, where ChronoLocalDate implements Comparable<ChronoLocalDate>
    }
}
