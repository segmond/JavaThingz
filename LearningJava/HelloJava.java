import javax.swing.*;

public class HelloJava {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java Frame");
        frame.setSize(300, 300);

        JLabel label = new JLabel("Hello Java Label", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}

