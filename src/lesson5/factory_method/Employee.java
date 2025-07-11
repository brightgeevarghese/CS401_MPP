package lesson5.factory_method;

public class Employee {
    private String employeeId;
    private String name;
    private String email;
    private String phoneNumber;
    private String message;

//    public Employee(String employeeId, String name, String email) {
//        this.employeeId = employeeId;
//        this.name = name;
//        this.email = email;
//    }
//
//    public Employee(String employeeId, String name, String phoneNumber) {
//        this.employeeId = employeeId;
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//    }
    private Employee() {}

    public static Employee createEmployeeForEmail(String employeeId, String name, String email) {
        Employee employee = new Employee();
        //use setters to set data

        return employee;
    }

    public static Employee createEmployeeForSMS(String employeeId, String name, String phoneNumber) {
        Employee employee = new Employee();
        //use setters to set data

        return employee;
    }

}
