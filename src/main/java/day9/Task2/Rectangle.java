package day9.Task2;

public class Rectangle extends Figure{
    private int height;
    private int width;

    public Rectangle(String colour, int height, int width) {
        super(colour);
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return (height * width);
    }

    @Override
    public double perimeter() {
        return (2 * (height + width));
    }
}
