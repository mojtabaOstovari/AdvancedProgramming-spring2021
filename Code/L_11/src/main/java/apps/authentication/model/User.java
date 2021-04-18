package apps.authentication.model;

import model.Model;

public class User extends Model {
    private String username;
    private String password;

    private Profile profile;

    public User(String username, String password, Profile profile) {
        this.username = username;
        this.password = password;
        this.profile = profile;
    }

    public void setPassword(String newPass){
        this.password = newPass;
    }

}
