package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        Player player7 = new Player();
        Player.info();
        System.out.println(Player.getCountPlayers());
        System.out.println(player1.getStamina());
        for (int i = 100; i > player1.getStamina() ; i--) {
            player1.run();
        }

        System.out.println(player1.getStamina());
        System.out.println(Player.getCountPlayers());
        Player.info();
    }
}
