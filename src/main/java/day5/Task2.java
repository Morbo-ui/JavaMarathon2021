package day5;


public class Task2 {
    public static void main(String[] args) {
        Moto moto = new Moto("black", "Nissan", 2012 );
        System.out.println(moto.getYear() + "\n" + moto.getModel() + "\n" + moto.getColor());
    }
}
