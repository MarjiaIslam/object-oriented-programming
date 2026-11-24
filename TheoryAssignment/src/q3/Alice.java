package q3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alice implements ActionListener{
    JFrame frame;
    JButton b;
    JLabel message;
    public Alice(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

          b = new JButton("Click");
          b.addActionListener(this);

          message = new JLabel("Alice in OOP land");
          message.setVisible(false);

          frame.add(message);
          frame.add(b);

         frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        message.setVisible(true);
        if(message.isVisible()){
        b.setText("OK");
        }
    }

    public static void main(String[] args) {
        Alice a = new Alice();
    }
}


