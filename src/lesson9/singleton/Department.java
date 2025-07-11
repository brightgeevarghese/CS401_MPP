package lesson9.singleton;

public enum Department {
    COMPRO;
    public void displayDepartment() {
        System.out.println("Department " + name());
    }
}
class MyDepartment {
    private MyDepartment() {}
    private static MyDepartment myDepartment;

    public static MyDepartment getInstance() {
        if (myDepartment == null) {
            myDepartment = new MyDepartment();
        }
        return myDepartment;
    }
    public void displayMyDepartment() {
        System.out.println(myDepartment);
    }
}

class Main{
    public static void main(String[] args) {
        MyDepartment myDepartment = MyDepartment.getInstance();
        //access the function from MyDepartment
        Department department = Department.COMPRO;
        department.displayDepartment();
    }
}