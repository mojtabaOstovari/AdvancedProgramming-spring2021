package view;

import javax.swing.*;

public class MainFrame extends JFrame {
    private static MainFrame instance = null;
    private MainPanel mainPanel = new MainPanel();
    public MainFrame() {
        super("Hello World");
        this.setVisible(true);
        this.setSize(500, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instance = this;

        this.add(mainPanel);
    }

    public static void refreshFrame(){
        SwingUtilities.updateComponentTreeUI(instance);
    }
}
