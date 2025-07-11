package lesson5.object_creation_factory_pattern.student_gradereport;

public class StudentGradeReportFactory {
    public static StudentGradeReport createStudentGradeReport(String studentName, String grade) {
        Student student = new Student(studentName);
        GradeReport gradeReport = new GradeReport(grade);
        //set the bidirectional association between Student and GradeReport
        student.setGradeReport(gradeReport);
        gradeReport.setStudent(student);
        return new StudentGradeReportImpl(student, gradeReport);
    }
}
