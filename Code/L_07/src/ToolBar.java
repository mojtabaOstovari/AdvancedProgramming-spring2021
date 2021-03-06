import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {
    JButton[] btnArray;

    ToolBar() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        btnArray = new JButton[4];
        for (int i = 0; i < btnArray.length; i++) {
            btnArray[i] = new JButton();
            btnArray[i].setText("btn " + i);
            btnArray[i].addActionListener(this);
            this.add(btnArray[i]);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        e.getSource();
    }
}
