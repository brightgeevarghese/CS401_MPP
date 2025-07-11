package lesson4.sequence_diagram.exercise_4_2.Company.ext;

import lesson4.sequence_diagram.exercise_4_2.Company.Company;
import lesson4.sequence_diagram.exercise_4_2.Company.Department;
import lesson4.sequence_diagram.exercise_4_2.Company.Employee;
import lesson4.sequence_diagram.exercise_4_2.Company.Position;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Mastercard");
        Department department = new Department("Compro", "McLaugh Building, 2000 N");
        Department department2 = new Department("MBA", "Drier Building, 2000 N");
        Position position = new Position("OA", "Office responsibilities");
        Position position2 = new Position("Dean", "Dept responsibilities");
        Position position3 = new Position("OA", "Office responsibilities");
        Position position4 = new Position("Dean", "Dept responsibilities");
        Employee employee = new Employee("John", 2000);
        Employee employee2 = new Employee("Jane", 2000);
        Employee employee3 = new Employee("Mike", 2000);

        //A company has many depts
        company.addDepartment(department);
        company.addDepartment(department2);

        //Each dept has many positions
        department.addPosition(position);
        department.addPosition(position2);

        department2.addPosition(position3);
        department2.addPosition(position4);

        //Each position is filled by one employee
        position.addEmployee(employee);
        position2.addEmployee(employee2);
        position3.addEmployee(employee3);

        double totalSalaryOfAllEmployees = company.getSalary();
        System.out.println("Total salary of all employees: " + totalSalaryOfAllEmployees);

    }
}
