package HW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame implements ActionListener {
    private JLabel label;
    private JButton add, subtract, reset;
    private int count = 0;

    public Counter() {
        setTitle("Counter");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(1, 3, 5, 5));
        label = new JLabel("0", JLabel.CENTER);
        add(label, BorderLayout.NORTH);

        add = new JButton("+");
        add.addActionListener(this);
        subtract = new JButton("-");
        subtract.addActionListener(this);
        reset = new JButton("Reset");
        reset.addActionListener(this);

        panel.add(add);
        panel.add(subtract);
        panel.add(reset);
        add(panel, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            count++;
        } else if (e.getSource() == subtract) {
            if (count > 0) {
                count--;
            }
        } else if (e.getSource() == reset) {
            count = 0;
        }

        label.setText(Integer.toString(count));
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        c.setVisible(true);
    }
}

