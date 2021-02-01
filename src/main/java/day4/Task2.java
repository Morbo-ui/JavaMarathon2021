package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        int max = 0;
        int min = 10000;
        int equal0 = 0;
        int sum0 = 0;
        for (int i : array) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            if (i % 10 == 0) {
                equal0++;
                sum0 += i;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(equal0);
        System.out.println(sum0);

    }
}
