package lesson13.generics_class;

public class Box<T, U> {
    private T data;
    private U data2;

    public Box(T data, U data2) {
        this.data = data;
        this.data2 = data2;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public U getData2() {
        return data2;
    }

    public void setData2(U data2) {
        this.data2 = data2;
    }
}

class Main {
    public static void main(String[] args) {
        Box<Integer, String> box1 = new Box<>(10, "hello");
        System.out.println(box1.getData());

        Box<String, String> box2 = new Box<>("Tom", "Jerry");
        String data = box2.getData();
    }
}