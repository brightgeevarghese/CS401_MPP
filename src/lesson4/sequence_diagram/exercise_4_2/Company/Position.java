package lesson4.sequence_diagram.exercise_4_2.Company;

public class Position {
    private String title;
    private String description;
    private Employee employee;
    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void addEmployee(Employee employee) {
        if (this.employee == null) {
            this.employee = employee;
        }
    }

    public double getSalary() {
        if (this.employee != null) {
            return this.employee.getSalary();
        }
        return 0;
    }
}
