package lesson4.sequence_diagram.exercise_4_2.Company;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    private List<Position> positions;
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        this.positions = new ArrayList<>();
    }

    public void addPosition(Position position) {
        this.positions.add(position);
    }

    public double getSalary() {
        double totalSalary = 0;
        for (Position position : positions) {
            totalSalary += position.getSalary();
        }
        return totalSalary;
    }
}
