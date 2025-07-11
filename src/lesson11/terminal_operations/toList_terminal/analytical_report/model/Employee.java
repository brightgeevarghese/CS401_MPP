package lesson11.terminal_operations.toList_terminal.analytical_report.model;

public class Employee {
    private int id;
    private double salary;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
