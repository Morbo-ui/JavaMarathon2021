package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("yellow");
        car.setModel("Buggati");
        car.setYear(1984);
        car.info();
        System.out.println(car.yearDifference(2020));
        Moto moto = new Moto();
        moto.setModel("Ducati");
        moto.setColor("Pink");
        moto.setYear(1999);
        moto.info();
        System.out.println(moto.yearDifference(2021));
    }
}
