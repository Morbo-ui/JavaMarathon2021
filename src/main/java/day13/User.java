package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);

    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }


    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        return username;
    }
}
