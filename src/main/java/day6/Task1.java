package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("yellow");
        car.setModel("Buggati");
        car.setYear(1984);
        System.out.println(car.yearDifference(2020));
        Moto moto = new Moto(1999, "Harley-Davidson", "red");
        moto.info();
        car.info();
    }
}
