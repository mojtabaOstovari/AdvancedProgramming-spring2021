import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class TextPanel extends JPanel {
    JTextArea textArea;

    TextPanel() {
        Dimension dim = this.getPreferredSize();
        dim.width = 200;
        System.out.println(dim.width);
        setPreferredSize(dim);
        this.setLayout(new BorderLayout());
        textArea = new JTextArea();
        this.add(textArea, BorderLayout.CENTER);
        textArea.setForeground(Color.PINK);
        Random random = new Random();
        textArea.setBackground(new Color(
                       random.nextInt(256),
                        random.nextInt(256),
                        random.nextInt(256)));

        Font font = new Font("Segoe Script", Font.PLAIN, 20);
        textArea.setFont(font);
        textArea.setSelectedTextColor(Color.BLUE);

        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_X) {
                    System.out.println("X");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public void addToText(String string) {
        this.textArea.append(string);
    }





}
