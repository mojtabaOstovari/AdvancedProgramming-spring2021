package view;

import listener.StringListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class ToolsBar extends JPanel implements ActionListener {
    private JButton registrationBtn;
    private JButton loginBtn;
    private LinkedList<StringListener> stringListeners = new LinkedList<>();

    ToolsBar() {
        this.setBackground(Color.GRAY);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        registrationBtn = new JButton("Register");
        registrationBtn.setPreferredSize(new Dimension(85, 35));
        this.add(registrationBtn);
        registrationBtn.addActionListener(this);

        loginBtn = new JButton("Login");
        loginBtn.setPreferredSize(new Dimension(85, 35));
        this.add(loginBtn);
        loginBtn.addActionListener(this);
    }

    public void addListener(StringListener stringListener) {
        stringListeners.add(stringListener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (StringListener stringListener : stringListeners) {
            if (registrationBtn == (JButton)e.getSource()){
                stringListener.stringEventOccurred("registration");
            }
            if (loginBtn == (JButton)e.getSource()) {
                stringListener.stringEventOccurred("login");
            }
        }
    }
}
