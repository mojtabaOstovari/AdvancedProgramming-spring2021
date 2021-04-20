package apps.authentication.controller;

import apps.authentication.model.User;
import apps.authentication.event.RegistrationFormEvent;

public class AuthController extends controller.Controller {
    public void changePassword(User user, String pass1, String pass2) {
        User owner = this.context.Users.get(user.id);
        if(pass1.equals(pass2)) {
            owner.setPassword(pass1);
            context.Users.update(owner);
        }
    }

    public void register(RegistrationFormEvent e){
        User user = new User(e.getName(), e.getPassword1(), null);
        context.Users.all();

        context.Users.add(user);
    }

}
