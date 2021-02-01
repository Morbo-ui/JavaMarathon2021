package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        int sum = 0;
        int max = 0;
        int maxSumId = 0;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 0; j < i; j++) {
                sum += array[j];
            }
            if (sum > max) {
                max = sum;
                maxSumId = i;
            }
        }
        System.out.println(max);
        System.out.println(maxSumId);
    }
}
