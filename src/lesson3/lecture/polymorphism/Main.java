package lesson3.lecture.polymorphism;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        StaffPerson[] people = {
//                new Faculty("Tom", "2000 N", "1234", "CAR", "Prof."),
//                new Secretary("Jack", "3000 N", "5678", "TRUCK", 2)
//        };
        List<StaffPerson> people = List.of(
                new Faculty("Tom", "2000 N", "1234", "CAR", "Prof."),
                new Secretary("Jack", "3000 N", "5678", "TRUCK", 2)
        );
        for (StaffPerson person : people) {
            if (person instanceof Faculty faculty) {
//                Faculty faculty = (Faculty) person;
                System.out.println(faculty.getName()+" "+faculty.getAddress()+" "+faculty.getPhoneNumber() +" "+faculty.getDrivesVehicle()+" "+faculty.getTitle());
            }
            if (person instanceof Secretary secretary) {
                //..
            }
        }
        //compute the total stipend of all people
        double sum = 0;
        for (StaffPerson person : people) {
            sum += person.computeStipend();
        }
        System.out.println("Total Stipend: "+sum);
    }
}
