import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame {
    ToolsBar toolsBar;
    TextPanel textPanel;
    JButton btn;
    MainFrame() {
        super("Hello World");
        this.setVisible(true);
        this.setSize(400, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        textPanel = new TextPanel();
        this.add(textPanel, BorderLayout.CENTER);

        this.add(new TextPanel(), BorderLayout.EAST);

        toolsBar = new ToolsBar();
        this.add(toolsBar, BorderLayout.NORTH);
        toolsBar.addListener(new Listener() {
            @Override
            public void listen(String string) {
                textPanel.addToText(string);
            }
        });
        toolsBar.addListener(new Listener() {
            @Override
            public void listen(String string) {
                System.out.println(string);
            }
        });

        btn = new JButton("OK");
        this.add(btn, BorderLayout.SOUTH);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
//                textArea.setBackground(new Color(
//                        random.nextInt(256),
//                        random.nextInt(256),
//                        random.nextInt(256)));
                //textArea.setText(textArea.getText() + "\n" + textArea.getText());
            }
        });


    }
}
