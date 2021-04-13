package view;

import interfaces.Listener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class ToolsBar extends JPanel implements ActionListener {
    private JButton registrationBtn;
    private JButton loginBtn;
    private LinkedList<Listener> listeners = new LinkedList<>();

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

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Listener listener : listeners) {
            if (registrationBtn == (JButton)e.getSource()){
                listener.listen("registration");
            }
            if (loginBtn == (JButton)e.getSource()) {
                listener.listen("login");
            }
        }
    }
}
