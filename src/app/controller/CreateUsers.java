package app.controller;

import app.model.User;

import java.util.List;
import java.util.Scanner;

public class CreateUsers {
    private final int MAX_USERS = 5;

    public void run() {
        Chat chat = new Chat();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < MAX_USERS; i++) {
            System.out.println("Введіть ім'я " + (i + 1) + "-го користувача: ");
            String name = scanner.nextLine();
            System.out.println("Введіть е-пошту " + (i + 1) + "-го коритсувача: ");
            String email = scanner.nextLine();
            chat.addUser(new User(name, email));
        }
        System.out.println("Пошук користувачів з однаковим параметром \n"
                + "Введіть параметр : ");
        String filter = scanner.nextLine();
        scanner.close();
        chat.printFilterUsers(filter);
    }
}
