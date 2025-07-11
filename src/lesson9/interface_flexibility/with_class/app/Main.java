package lesson9.interface_flexibility.with_class.app;

import lesson9.interface_flexibility.with_class.Book;
import lesson9.interface_flexibility.with_class.DinasourStatue;
import lesson9.interface_flexibility.with_class.DisplayItem;
import lesson9.interface_flexibility.with_class.Poster;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DisplayItem[] items = {
                new Book("James Gosling", LocalDate.of(2025, 7, 10), "Java"),
                new Book("James", LocalDate.of(2025, 7, 10), "Java in Action"),
                new Poster("Jack", LocalDate.of(2025, 7, 20), 10.25, 12.50),
                new Poster("Sily", LocalDate.of(2025, 7, 20), 10.25, 12.50),
//                DinasourStatue.STATUE// error ->DinasourStatue does not have inheritance relationship
        };
        for (DisplayItem item : items) {
            item.displayInfo();
        }
    }
}
