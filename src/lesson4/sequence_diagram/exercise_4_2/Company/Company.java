package lesson4.sequence_diagram.exercise_4_2.Company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();//zero or many (possible with an empty list)
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public double getSalary() {
        double totalSalary = 0;
        for (Department department : departments) {
            totalSalary += department.getSalary();
        }
        return totalSalary;
    }
}
