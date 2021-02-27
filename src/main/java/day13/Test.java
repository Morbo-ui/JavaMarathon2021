package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2,"Hello from user 1");
        user1.sendMessage(user2,"How you doing");

        user2.sendMessage(user1,"Hi user1");
        user2.sendMessage(user1,"Im user 2, Im fine");

        MessageDatabase.showDialog(user1,user2);


    }
}
