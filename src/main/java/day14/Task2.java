package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFIleToStringList());
    }

    public static List<String> parseFIleToStringList() {
        File file = new File("pople");
        List<String> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();



                people.add(line);

            }
            return people;


        } catch (FileNotFoundException e) {
            System.out.println("Файла-то нет, дебил");
        } catch (IllegalArgumentException e) {
            System.out.println("Po vozrastu oshibka");
        }
        return null;


    }
}
