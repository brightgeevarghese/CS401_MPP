package lesson5.object_creation_factory_pattern.student_gradereport;

public final class Student {
    private String name;
    private GradeReport gradeReport;

    Student(String name) {
        this.name = name;
    }

    void setGradeReport(GradeReport gradeReport) {
        this.gradeReport = gradeReport;
    }

    public String getName() {
        return name;
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }
}
