package apps.authentication.view;

import apps.authentication.event.RegistrationFormEvent;
import listener.FormListener;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationView extends JPanel implements ActionListener {
    private JTextField nameField = new JTextField(10);
    private JTextField emailField = new JTextField(10);
    private JTextField password1Field = new JTextField(10);
    private JTextField password2Field = new JTextField(10);

    private JButton registerBtn = new JButton("register");

    private FormListener formListener;

    public RegistrationView() {
        this.setBackground(Color.orange);
        Border innerBorder = BorderFactory.createTitledBorder("Registration form");
        Border outerBoarder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        this.setBorder(BorderFactory.createCompoundBorder(outerBoarder, innerBorder));

        this.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.weightx = 1;
        gc.weighty = 0.1;

        /////////////// 1
        gc.gridx = 0;
        gc.gridy = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        this.add(new JLabel("name: "), gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        this.add(nameField, gc);

        /////////////// 2
        gc.gridx = 0;
        gc.gridy = 1;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        this.add(new JLabel("email: "), gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        this.add(emailField, gc);

        /////////////// 3
        gc.gridx = 0;
        gc.gridy = 2;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        this.add(new JLabel("password: "), gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        this.add(password1Field, gc);

        /////////////// 4
        gc.gridx = 0;
        gc.gridy = 3;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        this.add(new JLabel("password: "), gc);

        gc.gridx = 1;
        gc.gridy = 3;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        this.add(password2Field, gc);

        /////////////// 5
        gc.weightx = 1;
        gc.weighty = 2;

        gc.gridx = 1;
        gc.gridy = 4;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        this.add(registerBtn, gc);

        registerBtn.addActionListener(this);

    }

    public String getNameField() {
        return nameField.getText();
    }

    public String getEmailField() {
        return emailField.getText();
    }

    public String getPassword1Field() {
        return password1Field.getText();
    }

    public String getPassword2Field() {
        return password2Field.getText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (registerBtn == (JButton)e.getSource()){
            RegistrationFormEvent registrationFormEvent =
                    new RegistrationFormEvent(this,
                            getName(),
                            getEmailField(),
                            getPassword1Field(),
                            getPassword2Field());

            formListener.eventOccurred(registrationFormEvent);
        }
    }

    public void setFormListener(FormListener formListener) {
        this.formListener = formListener;
    }
}
