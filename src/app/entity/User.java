package app.entity;

public class User {
    private String nameUser;
    private String emailUser;

    public String getNameUser() {
        return nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public User(String nameUser, String emailUser) {
        this.nameUser = nameUser;
        this.emailUser = emailUser;
    }

    @Override
    public String toString() {
        return "Ім'я: " + nameUser  +
                ", e-пошта: " + emailUser;
    }
}
