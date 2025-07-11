package lesson9.exercise2;

public enum Constants {
    COMPANY("Microsoft"), SALES_TARGET(20000);

    private String name;
    private int taget;
    Constants(String name) {
        this.name = name;
    }

    Constants(int target) {
        this.taget = target;
    }

    public String getName() {
        return name;
    }

    public int getTaget() {
        return taget;
    }
}
