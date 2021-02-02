package day5;

public class Moto {
    private int year;
    private String color;
    private String model;

    public Moto(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }

}
