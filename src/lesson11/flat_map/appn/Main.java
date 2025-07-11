package lesson11.flat_map.appn;

import lesson11.flat_map.model.Course;
import lesson11.flat_map.model.Student;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("101", "Tom");
        s1.addCourse("CS401", "MPP");
        s1.addCourse("CS402", "Java");

        Student s2 = new Student("102", "Jack");
        s2.addCourse("CS401", "MPP");
        s2.addCourse("CS402", "Java");

        Student s3 = new Student("103", "Jain");
        s3.addCourse("CS401", "MPP");
        s3.addCourse("CS402", "Java");

        List<Student> students = List.of(s1, s2, s3);
        Stream<Course> stream = students.stream()
                .flatMap(student -> student.getCourses().stream());
        System.out.println(stream.count());
    }
}











