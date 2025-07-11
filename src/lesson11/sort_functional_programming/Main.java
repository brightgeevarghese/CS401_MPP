package lesson11.sort_functional_programming;

import lesson11.sort_functional_programming.model.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Tom", 10),
                new Student("Jack", 40),
                new Student("Jain", 30),
                new Student("Bob", 30),
                new Student("Jain", 40)
        );
//        Collections.sort(students, Comparator.comparing((Student s) -> s.getName()));
        students.stream()
                .sorted(
                        Comparator.comparing(
                                (Student s) -> s.getName()
                        ).thenComparing(
                                s -> s.getGrade(), Comparator.reverseOrder()
                        )
                )
                .forEach(System.out::println);
    }
}
