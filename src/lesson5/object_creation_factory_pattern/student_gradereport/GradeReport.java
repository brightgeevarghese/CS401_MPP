package lesson5.object_creation_factory_pattern.student_gradereport;

public final class GradeReport {
    private String grade;
    private Student student;

    GradeReport(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    void setStudent(Student student) {
        this.student = student;
    }
    public Student getStudent() {
        return student;
    }
}
