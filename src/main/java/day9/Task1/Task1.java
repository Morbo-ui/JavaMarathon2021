package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Леха","БПИ");
        Teacher teacher = new Teacher("Владимир Александрович","Математка");
        student.printInfo();
        teacher.printInfo();

    }
}
