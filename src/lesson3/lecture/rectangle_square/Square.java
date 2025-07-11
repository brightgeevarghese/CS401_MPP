package lesson3.lecture.rectangle_square;

public class Square extends Rectangle {//Square is a Rectangle
    private double length;

    public Square(double length) {
        super(length, length);
        this.length = length;
    }

}
