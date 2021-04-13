package view;

import authentication.view.LoginView;
import authentication.view.RegistrationView;
import interfaces.Listener;

public class CenterToToolbarListener implements Listener {
    CenterPanel centerPanel;
    CenterToToolbarListener(CenterPanel centerPanel) {
        this.centerPanel = centerPanel;
    }
    public void listen(String string) {
        if (string.equals("registration")){
            centerPanel.removeAll();
            centerPanel.add(new RegistrationView());
        }
        if (string.equals("login")){
            centerPanel.removeAll();
            centerPanel.add(new LoginView());
        }
    }
}
