package day9.Task2;

public abstract class Figure {
    private String colour;

    public Figure(String colour){
        this.colour = colour;
    }
    public abstract double area();
    public abstract double perimeter();


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
