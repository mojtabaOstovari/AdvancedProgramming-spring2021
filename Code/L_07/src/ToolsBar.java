import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class ToolsBar extends JPanel implements ActionListener {
    private JButton btnH;
    private JButton btnG;

    private LinkedList<Listener> listeners;

    ToolsBar() {
        listeners = new LinkedList<>();
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        btnH = new JButton("btnH");
        btnG = new JButton("btnG");

        this.add(btnH);
        this.add(btnG);

        btnH.addActionListener(this);
        btnG.addActionListener(this);
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Listener listener : listeners) {
            if (btnG == (JButton)e.getSource()){
                listener.listen("G");
            }
            if (btnH == (JButton)e.getSource()) {
                listener.listen("H");
            }
        }
    }
}
