package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player() {
        this.stamina = getRandomInRange(90, MAX_STAMINA);
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public static int getRandomInRange(int start, int end) {
        Random random = new Random();
        return start + random.nextInt(end - start + 1);
    }


    public void run() {
        if (stamina == 0)
            return;
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " мест");
        else {
            System.out.println("Мест нет");}
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void setCountPlayers(int countPlayers) {
        Player.countPlayers = countPlayers;
    }
}
