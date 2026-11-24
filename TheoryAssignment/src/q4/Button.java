package q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {
        JFrame f;
        JButton b1;
        JButton b2;

        public Button(){
            f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(300, 150);
            f.setLayout(new FlowLayout());

            b1 = new JButton("Button 01");
            b1.setBackground(Color.RED);
            b1.addActionListener(this);

            b2 = new JButton("Button 02");
            b2.setBackground(Color.BLUE);
            b2.addActionListener(this);

            f.add(b1);
            f.add(b2);
            f.setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b1){
         if(b1.getBackground().equals(Color.RED)){
           b1.setBackground(Color.GREEN);
       }
        else if(b1.getBackground().equals(Color.GREEN)){
            b1.setBackground(Color.RED);
        }}

            if(e.getSource()==b2){
        if(b2.getBackground().equals(Color.BLUE)){
            b2.setBackground(Color.CYAN);
        }
        else if(b2.getBackground().equals(Color.CYAN)){
            b2.setBackground(Color.BLUE);
        }}
    }

    public static void main(String[] args) {
        Button b = new Button();
    }
}
