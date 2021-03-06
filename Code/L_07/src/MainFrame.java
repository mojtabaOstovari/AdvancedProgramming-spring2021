import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private ToolBar toolBar;
    private TextPanel textPanel;
    private JButton button;

    MainFrame() {
        super("Hello World");
        this.setSize(600, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        toolBar = new ToolBar();
        this.add(toolBar, BorderLayout.NORTH);

        textPanel = new TextPanel();
        this.add(textPanel, BorderLayout.CENTER);

        button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.f();
            }
        });

        this.add(button, BorderLayout.SOUTH);

    }
}
