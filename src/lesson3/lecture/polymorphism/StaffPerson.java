package lesson3.lecture.polymorphism;

public abstract class StaffPerson {
    private String name;
    private String address;//Address address;//expected
    private String phoneNumber;
    private String drivesVehicle;//Car, Truck, ...(best practice : use enum)

    public StaffPerson(String name, String address, String phoneNumber, String drivesVehicle) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.drivesVehicle = drivesVehicle;
    }

    abstract double computeStipend();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDrivesVehicle() {
        return drivesVehicle;
    }

    public void setDrivesVehicle(String drivesVehicle) {
        this.drivesVehicle = drivesVehicle;
    }
}
