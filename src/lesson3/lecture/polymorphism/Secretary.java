package lesson3.lecture.polymorphism;

public class Secretary extends StaffPerson{
    private int yearsOfService;

    public Secretary(String name, String address, String phoneNumber, String drivesVehicle, int yearsOfService) {
        super(name, address, phoneNumber, drivesVehicle);
        this.yearsOfService = yearsOfService;
    }

    @Override
    double computeStipend() {
        //diff.. BL
        return 1300;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }
}
