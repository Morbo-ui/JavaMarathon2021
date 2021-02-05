package day7;

public class Task1 {
    public static void main(String[] args) {
     Airplane airplane1 = new Airplane("Boeing", 2012, 240, 10000);
     Airplane airplane2 = new Airplane("Airbus", 2003, 300, 2000);
     Airplane.compareAirplanes(airplane1, airplane2);
    }
}