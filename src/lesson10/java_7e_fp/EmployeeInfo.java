package lesson10.java_7e_fp;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
    //sort by name and salary
    static enum SortMethod {
        BYNAME, BYSALARY
    }
    private SortMethod sortMethod;

    public EmployeeInfo(SortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    public void sort(List<Employee> employees) {
//        if (sortMethod == SortMethod.BYNAME) {
//            Collections.sort(employees, new Comparator<Employee>() {
//                @Override
//                public int compare(Employee o1, Employee o2) {
//                    return o1.getName().compareTo(o2.getName());
//                }
//            });
//        } else {
//            Collections.sort(employees, new Comparator<Employee>() {
//                @Override
//                  public int compare(Employee o1, Employee o2) {
//                    return (int) (o1.getSalary() - o2.getSalary());
//                }
//            });
//        }
        //use one comparator to do the same
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (sortMethod == SortMethod.BYNAME) {
                    return o1.getName().compareTo(o2.getName());
                }
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        });

        Comparator<Employee> ob = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (sortMethod == SortMethod.BYNAME) {
                    return o1.getName().compareTo(o2.getName());
                }
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        };
//        Comparator<Employee> employeeComparator = (o1, o2) -> {
//            if (sortMethod == SortMethod.BYNAME) {
//                return o1.getName().compareTo(o2.getName());
//            }
//            return Double.compare(o1.getSalary(), o2.getSalary());
//        };
    }
}
