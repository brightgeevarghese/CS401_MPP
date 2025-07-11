package lesson5.object_creation_factory_pattern.ext;


import lesson5.object_creation_factory_pattern.student_gradereport.StudentGradeReport;
import lesson5.object_creation_factory_pattern.student_gradereport.StudentGradeReportFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/***
 * To create a customized report, with student name and grade,
 * where the report is sorted based on grade
 */
public class Main {
    public static void main(String[] args) {
        //create a collection variable to store the report
        List<StudentGradeReport> gradeReports = new ArrayList<>();
        //Fetch data from the database(real time)
        StudentGradeReport report = StudentGradeReportFactory.createStudentGradeReport("Tom", "A+");
        gradeReports.add(report);
        report = StudentGradeReportFactory.createStudentGradeReport("Sam", "B");
        gradeReports.add(report);
        report = StudentGradeReportFactory.createStudentGradeReport("Lily", "A");
        gradeReports.add(report);
        //sort the report based on the grade value
//        Collections.sort(gradeReports, new Comparator<StudentGradeReport>() {
//            @Override
//            public int compare(StudentGradeReport o1, StudentGradeReport o2) {
//                return 0;
//            }
//        });
        gradeReports.sort(new Comparator<StudentGradeReport>() {
            List<String> gradeOrder = List.of("A+", "A", "B+", "B", "C+", "C", "D+", "D", "E+", "E", "F+");
            @Override
            public int compare(StudentGradeReport o1, StudentGradeReport o2) {
//                return o1.getGradeReport().getGrade().compareTo(o2.getGradeReport().getGrade());
                int index1 = gradeOrder.indexOf(o1.getGradeReport().getGrade());
                int index2 = gradeOrder.indexOf(o2.getGradeReport().getGrade());
                return Integer.compare(index1, index2);
            }
        });
        for (StudentGradeReport r : gradeReports) {
            System.out.println(r.getStudent().getName() +  "\t" + r.getGradeReport().getGrade());
        }
    }
}
