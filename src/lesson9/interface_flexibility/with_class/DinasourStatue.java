package lesson9.interface_flexibility.with_class;

import java.time.LocalDate;

public enum DinasourStatue {
    STATUE("Tom", LocalDate.of(2025, 7, 15));
    private final String name;
    private final LocalDate date;

    DinasourStatue(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
