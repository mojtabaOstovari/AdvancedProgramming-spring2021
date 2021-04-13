package authentication.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LoginView extends JPanel {
    JTextField usernameField = new JTextField(10);
    JTextField passwordField = new JTextField(10);

    JButton loginBtn = new JButton("login");

    public LoginView() {
        Border innerBorder = BorderFactory.createTitledBorder("login");
        Border outerBoarder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        this.setBorder(BorderFactory.createCompoundBorder(outerBoarder, innerBorder));

        this.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.weightx = 1;
        gc.weighty = 0.1;

        /////////////// 1
        gc.gridx = 0;
        gc.gridy = 0;
        gc.insets = new Insets(0, 0, 0, 7);
        gc.anchor = GridBagConstraints.LINE_END;
        this.add(new JLabel("username: "), gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0, 0, 0, 7);
        gc.anchor = GridBagConstraints.LINE_START;
        this.add(usernameField, gc);

        /////////////// 2
        gc.gridx = 0;
        gc.gridy = 2;
        gc.insets = new Insets(0, 0, 0, 7);
        gc.anchor = GridBagConstraints.LINE_END;
        this.add(new JLabel("password: "), gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        this.add(passwordField, gc);

        /////////////// 3
        gc.weightx = 1;
        gc.weighty = 2;

        gc.gridx = 1;
        gc.gridy = 4;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        this.add(loginBtn, gc);
    }
}
