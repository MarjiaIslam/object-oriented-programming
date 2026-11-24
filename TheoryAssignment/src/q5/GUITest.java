package q5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Oceans App");
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        String[] oceans = {"Arctic", "North Atlantic", "South Atlantic", "Indian", "North Pacific", "South Pacific", "Antarctic"};

        JTextField tf1 = new JTextField(20);
        JTextField tf2 = new JTextField(20);
        JButton show = new JButton("Show");


        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = Integer.parseInt(tf1.getText());
                    if (index >= 0 && index < oceans.length) {
                        tf2.setText(oceans[index]);
                    } else {
                        tf2.setText("Invalid index");
                    }
                } catch (NumberFormatException ex) {
                    tf2.setText("Invalid input");
                }
            }
        });


        f.add(tf1);
        f.add(tf2);
        f.add(show);

        f.setVisible(true);
    }
}
