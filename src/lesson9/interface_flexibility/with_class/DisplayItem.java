package lesson9.interface_flexibility.with_class;

import java.time.LocalDate;

public class DisplayItem {
    private String owner;
    private LocalDate returnDate;

    public DisplayItem(String owner, LocalDate returnDate) {
        this.owner = owner;
        this.returnDate = returnDate;
    }

    public String getOwner() {
        return owner;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
    public void displayInfo() {
        System.out.println("Owner: " + getOwner() + "\nReturnDate: " + getReturnDate());
    }
}
