package app.controller;

import app.model.User;

import java.util.List;

public class CreateUsers {
    public void run(){
        Chat chat = new Chat();
        chat.addUser(new User("Anna", "anna@gmail.com"));
        chat.addUser(new User("Bogdan", "bogdan@gmail.com"));
        chat.addUser(new User("Yevhen", "yevhen123@gmail.com"));
        chat.addUser(new User("Victor", "victor@gmail.com"));
        chat.addUser(new User("Oleg", "oleg123@gmail.com"));

        chat.printFilterUsers();
    }
}
