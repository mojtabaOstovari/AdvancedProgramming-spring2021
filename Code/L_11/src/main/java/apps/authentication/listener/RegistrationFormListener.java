package apps.authentication.listener;

import apps.authentication.controller.AuthController;
import apps.authentication.event.RegistrationFormEvent;
import listener.FormListener;

public class RegistrationFormListener implements FormListener {
    private AuthController controller = new AuthController();

    @Override
    public void eventOccurred(RegistrationFormEvent formEvent) {

        //
        controller.register(formEvent);
        //



    }
}
