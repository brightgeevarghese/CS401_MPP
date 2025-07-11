package lesson9.interface_flexibility.with_class;

import java.time.LocalDate;

public class Poster extends DisplayItem {
    private double width;
    private double height;

    public Poster(String owner, LocalDate returnDate, double width, double height) {
        super(owner, returnDate);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
