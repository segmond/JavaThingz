import java.awt.*;
import java.awt.event.*; // java.awt.* doesn't automatically import the event package
import javax.swing.*;

public class HelloButtonDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Button Demo");
        frame.add(new HelloButtonComponent("Button Demo, Drag me around!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}


class HelloButtonComponent extends JComponent implements MouseMotionListener, ActionListener {
    
    String theMessage;
    int messageX = 125, messageY = 95; // Coordinates of the message

    JButton theButton;

    int colorIndex; // current index into someColors
    static Color[] someColors = { Color.white, Color.black, Color.red, Color.green, Color.blue, Color.magenta };

    public HelloButtonComponent(String message) {
        theMessage = message;
        theButton = new JButton("Change Color");
        setLayout(new FlowLayout());
        add(theButton);
        theButton.addActionListener(this);
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        // Save the mouse coordiantes and paint the message
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) { }

    public void actionPerformed(ActionEvent e) {
        // Did someone push our button?
        if (e.getSource() == theButton) {
            changeColor();
        }
    }

    synchronized private void changeColor() {
        setForeground(currentColor()); 
        repaint();
    }

    synchronized private Color currentColor() {
        colorIndex = ++colorIndex % someColors.length;
        return someColors[colorIndex];
    }

}
