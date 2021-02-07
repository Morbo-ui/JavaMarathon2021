package day9.Task2;

public class Circle extends Figure{
    private double radius;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI * radius*radius);
    }

    @Override
    public double perimeter() {
        return Math.PI * radius * 2;
    }
}
