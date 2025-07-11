package lesson9.interface_flexibility.with_interface;

import java.time.LocalDate;

public interface DisplayItem {
    public abstract String getOwner();
    public abstract LocalDate getReturnDate();
    public default void displayInfo() {
        System.out.println(getOwner() + ": " + getReturnDate());
    }
}
class Book implements DisplayItem {
    private final String title;
    private final LocalDate returnDate;
    private final String owner;
    public Book(String title, LocalDate returnDate, String owner) {
        this.title = title;
        this.returnDate = returnDate;
        this.owner = owner;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public LocalDate getReturnDate() {
        return returnDate;
    }
}
class Poster implements DisplayItem {
    private final LocalDate returnDate;
    private final String owner;
    private double length;
    private double width;

    public Poster(LocalDate returnDate, String owner, double length, double width) {
        this.returnDate = returnDate;
        this.owner = owner;
        this.length = length;
        this.width = width;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public LocalDate getReturnDate() {
        return returnDate;
    }
}
enum DinasourStatue implements DisplayItem {
    DINASOUR_STATUE("Tom", LocalDate.of(2025, 7, 10));

    private final String owner;
    private final LocalDate returnDate;
    DinasourStatue(String owner, LocalDate returnDate) {
        this.owner = owner;
        this.returnDate = returnDate;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public LocalDate getReturnDate() {
        return returnDate;
    }
}
class Main {
    public static void main(String[] args) {
        DisplayItem[]  items = new DisplayItem[] {
                new Book("James", LocalDate.of(2025, 7, 10), "Java in Action"),
                new Poster(LocalDate.of(2025, 7, 20),  "Sily", 10.25, 12.50),
                DinasourStatue.DINASOUR_STATUE
        };
        for (DisplayItem item : items) {
            item.displayInfo();
        }
    }
}
