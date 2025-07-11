package lesson5.object_creation_factory_pattern.student_gradereport;

public class StudentGradeReportImpl implements StudentGradeReport {
    private Student student;
    private GradeReport gradeReport;
    StudentGradeReportImpl(Student student, GradeReport gradeReport) {
        this.student = student;
        this.gradeReport = gradeReport;
    }
    @Override
    public Student getStudent() {
        return student;
    }

    @Override
    public GradeReport getGradeReport() {
        return gradeReport;
    }
}
