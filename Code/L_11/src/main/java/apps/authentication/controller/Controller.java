package apps.authentication.controller;

import apps.authentication.model.User;

public class Controller extends controller.Controller {
    void changePassword(User user, String pass1, String pass2) {
        User owner = this.context.Users.get(user.id);
        if(pass1.equals(pass2)) {
            owner.setPassword(pass1);
            context.Users.update(owner);
        }
    }
}
