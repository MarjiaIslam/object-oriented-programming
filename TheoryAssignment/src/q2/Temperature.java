package q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature implements ActionListener {
    JFrame frame;
    JLabel celsius;
    JTextField tc;
    JLabel fahrenheit;
    JTextField tf;
    JButton b;

    public Temperature() {
        frame = new JFrame("CtoF Converter");
        frame.setBounds(100, 100, 400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        celsius = new JLabel("Enter Celsius value:");
        tc = new JTextField(20);
        fahrenheit = new JLabel("Fahrenheit Value:");
        tf = new JTextField(20  );
        b = new JButton("Convert to Fahrenheit");

        b.addActionListener(this);

        frame.add(celsius);
        frame.add(tc);
        frame.add(fahrenheit);
        frame.add(tf);
        frame.add(b);



        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String c = tc.getText();
        if (!c.isEmpty()) {
            double celsius = Double.parseDouble(c);
            double fahrenheit = (celsius * 9 / 5) + 32;
            tf.setText(String.valueOf(fahrenheit));
        }
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
    }
}
