package problem01;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class TreasureHunt implements ActionListener, WindowListener {
    Frame main, win, lose;
    Label msg, lives, winner, loser;
    Panel p1, p2, p3, p4;
    Button b1, b2, b3;
    int life = 3;
    int door;
    Random r = new Random();

    public TreasureHunt(){
        main = new Frame("Treasure Hunt");
        win = new Frame("Treasure Hunt");
        lose = new Frame("Treasure Hunt");

        msg = new Label("|| Please Choose a Door ||");
        lives = new Label("Lives Left: " + life);
        winner = new Label(" Hooray!! you have found the treasure successfully!!");
        loser = new Label(" Alas!! You have lost.");

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();

        b1 = new Button("DOOR 01");
        b2 = new Button("DOOR 02");
        b3 = new Button("DOOR 03");
        TreasureDoor();

    }

    public void TreasureDoor(){
        door = r.nextInt(3) + 1;
        System.out.println("HINT: the treasure is right behind the door " + door);
    }

    public void launchFrame(){
        main.setSize(600,600);
        main.setResizable(false);
        main.setVisible(true);
        main.setLayout(new GridLayout(2,1));
        main.addWindowListener(this);

        win.setSize(600,600);
        win.setResizable(false);
        win.setVisible(false);
        win.setBackground(Color.BLUE);
        win.setLayout(new FlowLayout());
        win.addWindowListener(this);

        lose.setSize(600,600);
        lose.setResizable(false);
        lose.setVisible(false);
        lose.setBackground(Color.CYAN);
        lose.setLayout(new FlowLayout());
        lose.addWindowListener(this);

        b1.setBackground(Color.PINK);
        b1.addActionListener(this);
        b2.setBackground(Color.PINK);
        b2.addActionListener(this);
        b3.setBackground(Color.PINK);
        b3.addActionListener(this);

        msg.setFont(new Font("Arial",Font.BOLD,20));
        lives.setFont(new Font("Arial", Font.ITALIC,17));
        winner.setFont(new Font("Arial", Font.BOLD, 22));
        loser.setFont(new Font("Arial", Font.BOLD, 22));

        p1.setBackground(Color.LIGHT_GRAY);
        p1.setLayout(new FlowLayout());
        p1.add(lives);


        p2.setBackground(Color.LIGHT_GRAY);
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        p2.add(msg);

        p3.setLayout(new GridLayout(1,3,10,10));
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);

        p4.setLayout(new BorderLayout());
        p4.add(p2, BorderLayout.NORTH);
        p4.add(p3, BorderLayout.CENTER);

        main.add(p1);
        main.add(p4);

        winner.setForeground(Color.WHITE);
        win.add(winner);
        lose.add(loser);

    }

    public static void main(String[] args) {
        TreasureHunt th = new TreasureHunt();
        th.launchFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(b1)){
            if(door==1){
                main.setVisible(false);
                win.setVisible(true);
            } else{
                life--;
                lives.setText("Lives Left: " + life);
                if(life>0) {
                    msg.setText("oops!! Wrong guess. Try again...");
                    msg.setFont(new Font("Arial", Font.PLAIN, 17));
                    TreasureDoor();
                }else {
                    main.setVisible(false);
                    lose.setVisible(true);
                }
            }
        }

        if(e.getSource().equals(b2)){
            if(door==2){
                main.setVisible(false);
                win.setVisible(true);
            } else{
                life--;
                lives.setText("Lives Left: " + life);
                if(life>0) {
                    msg.setText("oops!! Wrong guess. Try again...");
                    msg.setFont(new Font("Arial", Font.PLAIN, 17));
                    TreasureDoor();
                }
                else {
                    main.setVisible(false);
                    lose.setVisible(true);
                }
            }
        }

        if(e.getSource().equals(b3)){
            if(door==3){
                main.setVisible(false);
                win.setVisible(true);
            } else{
                life--;
                lives.setText("Lives Left: " + life);
                if(life>0) {
                    msg.setText("oops!! Wrong guess. Try again...");
                    msg.setFont(new Font("Arial", Font.PLAIN, 17));
                    TreasureDoor();
                }
                else {
                    main.setVisible(false);
                    lose.setVisible(true);
                }
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
