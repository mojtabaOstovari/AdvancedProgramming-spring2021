package apps.authentication.model;

import model.Model;

public class Profile extends Model {
    String phone;
    int age;
    String email;

    public Profile(String phone, int age, String email) {
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

}
