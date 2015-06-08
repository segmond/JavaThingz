import javax.swing.*;
import java.awt.*;

public class HelloComponent extends JComponent {

    public void paintComponent(Graphics g) {
        g.drawString("Hello, Graphics.drawString()", 125, 95);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java Frame");
        frame.setSize(300, 300);

        frame.add(new HelloComponent());
        //JLabel label = new JLabel("Hello Java Label", JLabel.CENTER);
        //frame.add(label);
        frame.setVisible(true);
    }
}

