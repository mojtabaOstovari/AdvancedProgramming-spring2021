package view;

import listener.StringListener;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private ToolsBar toolsBar;
    private CenterPanel centerPanel;
    private BottomPanel bottomPanel;

    public MainPanel(ToolsBar toolsBar, CenterPanel centerPanel, BottomPanel bottomPanel) {
        this.toolsBar = toolsBar;
        this.centerPanel = centerPanel;
        this.bottomPanel = bottomPanel;
    }

    public MainPanel() {
        this.setLayout(new BorderLayout());

        centerPanel = new CenterPanel();
        this.add(centerPanel, BorderLayout.CENTER);

        toolsBar = new ToolsBar();
        this.add(toolsBar, BorderLayout.NORTH);

        bottomPanel = new BottomPanel();
        this.add(bottomPanel, BorderLayout.SOUTH);

        toolsBar.addListener(new StringListener() {
            @Override
            public void stringEventOccurred(String string) {
                if (string.equals("registration")){
                    bottomPanel.setText("Join us!");
                }
                if (string.equals("login")){
                    bottomPanel.setText("Welcome!");
                }
            }
        });

        toolsBar.addListener(new CenterToToolbarStringListener(centerPanel));
    }

}
