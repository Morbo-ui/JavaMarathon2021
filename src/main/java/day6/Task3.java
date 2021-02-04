package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Владимир Владимирович", "Математика");
        Student student = new Student("Лёха");
     teacher.evaluate(student);
    }
}
