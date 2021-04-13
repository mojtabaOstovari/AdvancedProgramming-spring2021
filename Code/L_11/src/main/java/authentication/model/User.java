package authentication.model;

public class User {
    int id;
    String username;
    String email;
    String password;

    Profile profile;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
