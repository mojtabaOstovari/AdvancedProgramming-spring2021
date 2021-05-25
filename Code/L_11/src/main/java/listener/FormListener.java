package listener;


import apps.authentication.event.RegistrationFormEvent;

public interface FormListener {

    void eventOccurred(RegistrationFormEvent formEvent);

}
