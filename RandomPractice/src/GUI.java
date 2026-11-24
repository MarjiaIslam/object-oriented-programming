import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Frame"); //Creating the top level container
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 100);
        JPanel p = new JPanel();
        JButton b = new JButton("Click here"); //Create a JButton object
        p.add(b); //add button to panel
        f.add(p); //add panel to frame

        f.setVisible(true);
    }
}