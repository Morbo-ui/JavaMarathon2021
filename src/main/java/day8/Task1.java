package day8;

public class Task1 {
    public static void main(String[] args) {
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++)
            s += i + " ";


        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;

        System.out.println("String " + timeConsumedMillis);
        System.out.println(s);


        StringBuilder sb = new StringBuilder("");
         start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++)
            sb.append(i).append(" ");

         finish = System.currentTimeMillis();
         timeConsumedMillis = finish - start;
        System.out.println(" StringBuilder :" + timeConsumedMillis);

        System.out.println(sb);


    }
}
