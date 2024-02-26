package app.view;

import app.controller.Chat;
import app.entity.User;

import java.util.List;
import java.util.Scanner;

public class UserRecording {
    private final int MAX_USERS = 5;

    public void run() {
        Chat chat = new Chat();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < MAX_USERS; i++) {
            System.out.println("Введіть ім'я " + (i + 1) + "-го користувача: ");
//            String name = scanner.nextLine();
            String name = "123 ".concat(String.valueOf(i));
            System.out.println("Введіть е-пошту " + (i + 1) + "-го коритсувача: ");
//            String email = scanner.nextLine();
            String email = "123 ".concat(String.valueOf(i));
            chat.addUser(new User(name, email));
        }
        System.out.println("Пошук користувачів з однаковим параметром \n"
                + "Введіть параметр : ");
        String filter = scanner.nextLine();
        scanner.close();
        printFilterUsers(chat, filter);
    }

    public void printFilterUsers(Chat chat, String filter) {

        List<User> filteredUsers = chat.filterUsers(filter);
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
