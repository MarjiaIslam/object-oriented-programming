package class11;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class LogInPage implements WindowListener, ActionListener {
    Frame f;
    Button b;
    TextField user, pass;
    Label u, p, result;

    public LogInPage() {
        //create UI Objects
        f = new Frame("Login Page");
        user = new TextField();
        pass = new TextField();
        b = new Button("Log In");
        b.setActionCommand("1");

        u = new Label("Username");
        p = new Label("Password");
        result = new Label("");
    }

    public void launchFrame() {
        //front end code
        user.setBounds(100, 100, 200, 25);
        f.add(user);
        pass.setBounds(100, 150, 200, 25);
        f.add(pass);

        b.setBounds(175, 200, 50, 25);
        b.addActionListener(this);
        f.add(b);

        u.setBounds(100, 75, 200, 25);
        f.add(u);
        p.setBounds(100, 125, 200, 25);
        f.add(p);
        result.setBounds(175, 225, 50, 25);
        f.add(result);

        f.addWindowListener(this);
        f.setResizable(false);
        f.setSize(400, 400);
        f.setBackground(Color.GREEN);
        f.setLayout(null);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //back end code
        String username = "admin";
        String password = "1234";

        if (e.getActionCommand() == "1") {
            String userText = user.getText();
            String passText = pass.getText();

            if (userText.equals(username) && passText.equals(password)) {
                result.setText("Login Successful");
            }else{
                result.setText("Incorrect Credentials");
            }
        }
    }

    public static void main(String[] args) {
        LogInPage p = new LogInPage();
        p.launchFrame();
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
