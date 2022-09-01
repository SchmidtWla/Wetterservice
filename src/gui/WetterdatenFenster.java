package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class WetterdatenFenster extends Panel {

    public WetterdatenFenster() {
        JPanel panel = new JPanel(new BorderLayout(5,5));
        Border outerBorderParameter = createOuterBorder("Parameter für A1: ");
        this.setLayout(new BorderLayout(5,5));
        JTextField text = new JTextField("Hello World");
        this.add(text, BorderLayout.NORTH);

    }


    private Border createOuterBorder(String title) {
        Border dateEmptyOuterBorder = BorderFactory.createEmptyBorder(5, 10, 10, 10);
        Border dateOuterBorder = BorderFactory.createTitledBorder(null, title, 0, 0, null, Color.BLACK);
        Border dateInnerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border dateCompoundBorder = BorderFactory.createCompoundBorder(dateOuterBorder, dateInnerBorder);
        return BorderFactory.createCompoundBorder(dateEmptyOuterBorder, dateCompoundBorder);
    }
}
