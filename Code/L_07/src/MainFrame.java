import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame() {
        super("Hello World");
        this.setVisible(true);
        this.setSize(400, 300);
        //frame.setMaximizedBounds(new Rectangle(800, 600));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                ImageIcon img = new ImageIcon("");
//                frame.setIconImage(img.getImage());

        this.setLayout(new BorderLayout());

        JButton btn = new JButton("OK");
        this.add(btn, BorderLayout.SOUTH);

        JTextArea textArea = new JTextArea();
        this.add(textArea, BorderLayout.CENTER);
        textArea.setForeground(Color.PINK);
        textArea.setBackground(Color.CYAN);

        Font font = new Font("Segoe Script", Font.PLAIN, 20);
        textArea.setFont(font);
        textArea.setSelectedTextColor(Color.BLUE);

    }
}
