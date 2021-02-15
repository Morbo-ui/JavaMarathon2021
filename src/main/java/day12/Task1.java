package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> brandCars = new ArrayList<>();
        brandCars.add("Buggati");
        brandCars.add("Tesla");
        brandCars.add("Toyota");
        brandCars.add("Nissan");
        brandCars.add("Ford");
        brandCars.add(2,"APPLE");
        brandCars.remove(0);
        System.out.println(brandCars);
    }
}
