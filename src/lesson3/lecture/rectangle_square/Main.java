package lesson3.lecture.rectangle_square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getArea());//12.0
        Rectangle square = new Square(5);
        square.setWidth(6);
        System.out.println(square.getArea());//
    }
}
