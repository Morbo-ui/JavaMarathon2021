package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if (numbers.length != 10) {
                throw new IllegalArgumentException();

            }
            int sum = 0;
            for (String mumber : numbers) {
                sum += Integer.parseInt(mumber);
            }
            System.out.println(sum);


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Innapropriate input");
        }

    }
}
