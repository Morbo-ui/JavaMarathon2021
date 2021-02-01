package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        Random rand = new Random();
        int kolvo = 0;
        int equal1 = 0;
        int chetnie = 0;
        int nechetnie = 0;
        int sum = 0;
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
            array[i] = rand.nextInt(10);
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > 8) {
                kolvo++;
            }
            if (array[i] == 1) {
                equal1++;
            }
            if (array[i] % 2 == 0) {
                chetnie++;
            } else nechetnie++;
            sum = sum + array[i];
        }
        System.out.println("Длина массива: " + arrayLength);
        System.out.println("Количество чисел больше 8: " + kolvo);
        System.out.println("Количество равных 1: " + equal1);
        System.out.println("Количество четных чисел: " + chetnie);
        System.out.println("Количество нечетных чисел: " + nechetnie);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
