package lesson9.interface_flexibility.with_class;

import java.time.LocalDate;

public class Book extends DisplayItem{
    private String title;

    public Book(String owner, LocalDate returnDate, String title) {
        super(owner, returnDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
