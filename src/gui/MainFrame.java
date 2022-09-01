package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame extends JFrame {
    JFrame mainFrame;
    public MainFrame() {
        this.mainFrame = new JFrame("index");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout(5,5));
        mainFrame.add(mainPanel);
        mainPanel.add(new WetterdatenFenster(), BorderLayout.NORTH);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
