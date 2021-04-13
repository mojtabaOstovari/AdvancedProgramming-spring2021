package view;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {
    private JLabel label = new JLabel();
    public BottomPanel() {
        this.setBackground(Color.pink);
        this.add(label);
    }

    public void setText(String text) {
        label.setText(text);
    }
}
