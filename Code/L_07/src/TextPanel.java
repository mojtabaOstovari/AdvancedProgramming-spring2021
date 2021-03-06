import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private JTextArea textArea;
    TextPanel() {
        this.setLayout(new BorderLayout());
        textArea = new JTextArea();
        textArea.setBackground(Color.MAGENTA);
        Font font = new Font("Calibr", Font.PLAIN, 20);
        textArea.setFont(font);
        this.add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void f() {
        textArea.setForeground(Color.CYAN);
    }

}
