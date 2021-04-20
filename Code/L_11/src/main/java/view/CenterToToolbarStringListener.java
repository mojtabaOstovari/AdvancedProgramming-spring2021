package view;

import apps.authentication.listener.RegistrationFormListener;
import apps.authentication.view.*;
import listener.StringListener;

public class CenterToToolbarStringListener implements StringListener {
    private CenterPanel centerPanel;
    RegistrationView registrationView = new RegistrationView();
    CenterToToolbarStringListener(CenterPanel centerPanel) {
        this.centerPanel = centerPanel;
    }
    public void stringEventOccurred(String string) {
        if (string.equals("registration")){
            centerPanel.removeAll();
            registrationView.setFormListener(new RegistrationFormListener());
            centerPanel.add(registrationView);
        }
        if (string.equals("login")){
            centerPanel.removeAll();
            centerPanel.add(new LoginView());
        }
    }
}
