package lesson3.lecture.polymorphism;

public class Faculty extends StaffPerson{
    private String title;

    public Faculty(String name, String address, String phoneNumber, String drivesVehicle, String title) {
        //super();//no supe() call
        super(name, address, phoneNumber, drivesVehicle);
        this.title = title;
    }

    @Override
    double computeStipend() {
        //diff. BL
        return 1500;
    }

    public String getTitle() {
        return title;
    }
}
