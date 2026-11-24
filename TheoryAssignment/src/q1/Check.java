package q1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Check implements ActionListener{
    JFrame f;
    JPanel p;
    JCheckBox c;
    JButton b;
    public Check(){
        f = new JFrame("Checkbox");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 150);

          p = new JPanel();
          c = new JCheckBox();
          b = new JButton("Check");
          b.addActionListener(this);

        p.add(c);
        p.add(b);

        f.add(p);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (c.isSelected()) {
                c.setSelected(false);
                b.setText("Check");
            } else {
                c.setSelected(true);
                b.setText("Uncheck");
            }
    }

    public static void main(String[] args) {
        Check c = new Check();
    }
}