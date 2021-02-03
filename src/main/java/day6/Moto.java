package day6;


public class Moto {
    private int year;
    private String color;
    private String model;

  public Moto(int year, String model, String color){
      this.year = year;
      this.model = model;
      this.color = color;
  }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    void info() {
        System.out.println("Это мотоцикл");
    }
}
