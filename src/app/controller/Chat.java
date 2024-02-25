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
        users.add(user);
    }

    public List<User> filterUsers(String filter) {
        return users.stream().filter(user -> user.getEmailUser().contains(filter))
                .collect(Collectors.toList());
    }

    public void printFilterUsers(String filter) {
        List<User> filteredUsers = filterUsers(filter);
        if (filteredUsers.isEmpty()) {
            System.out.println("Немає користувачів, які мають в е-пошті " + filter);
        } else {
            System.out.println("Коритсувачі, які мають в е-пошті " + filter + ": "
                    + filteredUsers.size());
            for (User user : filteredUsers) {
                System.out.println(user);
            }
        }
    }
}
