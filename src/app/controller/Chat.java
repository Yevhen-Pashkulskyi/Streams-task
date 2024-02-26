package app.controller;

import app.entity.User;

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
}
