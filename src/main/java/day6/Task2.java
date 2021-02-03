package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2012, 240, 10000);
        airplane.fillUp(1000);
        airplane.fillUp(2000);
        airplane.info();
        Airplane airplane1 = new Airplane("Airbus", 2012, 240, 10000);
        airplane1.setLength(300);
        airplane1.setYear(1999);
        airplane1.info();
    }
}
