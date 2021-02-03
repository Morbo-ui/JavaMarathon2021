package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public int getFuel(){
        return fuel;
    }
    public Airplane(String producer, int year, int length, int weight){
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.producer = producer;
    }
    void info(){
        System.out.println("Изготовитель: ");
    }
}
