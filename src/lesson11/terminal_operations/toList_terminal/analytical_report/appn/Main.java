package lesson11.terminal_operations.toList_terminal.analytical_report.appn;

import lesson11.terminal_operations.toList_terminal.analytical_report.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new  Employee(1, 1000),
                new Employee(2, 500),
                new Employee(3, 2000)
        );

//        System.out.println(
//                employees.stream()
//                        .map(e -> e.getSalary())
//                        .collect(Collectors.summarizingDouble(new ToDoubleFunction<Double>() {
//                            @Override
//                            public double applyAsDouble(Double value) {
//                                return value;
//                            }
//                        }))
//        );
        System.out.println(
                employees.stream()
                .map(employee -> employee.getSalary())
                .collect(Collectors.summarizingDouble(value -> value))
        );

        System.out.println(
                DoubleStream.of(1.0, 2.0, 3.0, 4.0)
                        .summaryStatistics()
        );
        System.out.println(
                employees.stream()
                        .map(employee -> employee.getSalary())
                        .mapToDouble(value -> value)
                        .summaryStatistics()
        );

       Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(
                stream.mapToInt(value -> value)
                        .summaryStatistics()
        );
    }
}
