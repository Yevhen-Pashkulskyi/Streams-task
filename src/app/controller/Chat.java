package app.controller;

import app.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Chat {
    private List<User> users;

    public Chat() {
       users = new ArrayList<>();
    }

    public void addUser(User user) {
        users .add(user);
    }

    public List<User> filterUsers() {
        return users.stream().filter(user -> user.getEmailUser().contains("123"))
                .collect(Collectors.toList());
    }

    public void printFilterUsers() {
        List<User> filteredUsers = filterUsers();
        if (filteredUsers.isEmpty()) {
            System.out.println("Немає користувачів, які мають в е-пошті '123'");
        } else {
            System.out.println("Коритсувачі, які мають в е-пошті '123': "
                    + filteredUsers.size());
            for (User user : filteredUsers) {
                System.out.println(user);
            }
        }
    }
}
