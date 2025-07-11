package lesson10.java_7e_fp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tom", 2000));
        employees.add(new Employee("Bob", 3000));
        employees.add(new Employee("Jack", 2500));

//        Collections.sort(employees);//ERROR
//        Collections.sort(
//                employees,
//                new EmployeeNameComparator()//here object behaves like a function
//        );//sorted based on name
//        System.out.println(employees);
        //sort based on salary
//        Collections.sort(employees, new EmployeeSalaryComparator());
//        System.out.println(employees);
        //sort by name
        EmployeeInfo employeeInfo = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
        employeeInfo.sort(employees);
        System.out.println(employees);

        //sort by salary
        employeeInfo = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
        employeeInfo.sort(employees);
        System.out.println(employees);

        employees.sort(
                (o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())
        );

        Collections.sort(
                employees,
                (o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())
        );
    }
}
