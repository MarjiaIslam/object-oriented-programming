package problem02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class PhoneBookApp implements ActionListener, WindowListener {
    Frame f;
    Panel p1, p2, p3, p4, p5;
    Label lname, laddress, lphone;
    TextField n, a, ph, s;
    TextArea display;
    Button add, show, clear, search;
    ScrollPane sp;


    public PhoneBookApp(){
        f = new Frame("Phone Book");

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        p5 = new Panel();

        lname = new Label("Name: ");
        laddress = new Label("Address: ");
        lphone = new Label("Phone Number : ");

        n = new TextField();
        a = new TextField();
        ph = new TextField();
        s = new TextField("Enter the name you want to search");

        display = new TextArea();
        sp = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);

        add = new Button("AddNewPerson");
        show = new Button("ShowPhoneBook");
        clear = new Button("clearAll");
        search = new Button("Search");
    }

    public void LaunchFrame(){
        f.setSize(600, 600);
        f.setResizable(false);
        f.setVisible(true);
        f.addWindowListener(this);
        f.setLayout(new GridLayout(3,1));

        display.setSize(500,400);
        display.setEditable(false);
        sp.add(display);


        add.setSize(60,20);
        add.setBackground(Color.lightGray);
        add.addActionListener(this);


        show.setSize(60,20);
        show.setBackground(Color.lightGray);
        show.addActionListener(this);

        clear.setSize(60,20);
        clear.setBackground(Color.lightGray);
        clear.addActionListener(this);

        search.setSize(60,20);
        search.setBackground(Color.lightGray);
        search.addActionListener(this);

        p1.setBackground(Color.PINK);
        p1.setLayout(new GridLayout(3,2,10,10));
        p1.add(lname);
        p1.add(n);
        p1.add(laddress);
        p1.add(a);
        p1.add(lphone);
        p1.add(ph);

        p2.setBackground(Color.PINK);
        p2.setLayout(new FlowLayout(FlowLayout.CENTER,20,50));
        p2.add(add);
        p2.add(show);
        p2.add(clear);

        p3.setBackground(Color.PINK);
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
        p3.add(s);
        p3.add(search);

        p4.setBackground(Color.PINK);
        p4.setLayout(new BorderLayout());
        p4.add(sp, BorderLayout.CENTER);

        p5.setLayout(new BorderLayout());
        p5.add(p3, BorderLayout.NORTH);
        p5.add(p4, BorderLayout.CENTER);

        f.add(p1);
        f.add(p2);
        f.add(p5);
    }


    public static void main(String[] args) {
        PhoneBookApp p = new PhoneBookApp();
        p.LaunchFrame();

    }
    ArrayList<Person> persons = new ArrayList<>();



    @Override
    public void actionPerformed(ActionEvent e) {
        String n1 = n.getText();
        String a1 = a.getText();
        String ph1 = ph.getText();
        int id = persons.size()+1 ;

        if(e.getSource().equals(add)) {
        if ((n1.isEmpty() || a1.isEmpty() || ph1.isEmpty())) {
                display.setText("Text Fields are empty!");
                return;
            }
            boolean exists = false;
            for (Person s : persons) {
                if (s.name.equals(n1) && s.address.equals(a1) && s.phone.equals(ph1)) {
                    display.setText("This contact already exists in the Phone Book.");
                    exists = true;
                    break;
                }
            }
                if(!exists){
                    persons.add(new Person(id, n1, a1, ph1));
                    display.setText(n1 + " has been added in the contacts successfully!");
                }

        }

        if(e.getSource().equals(show)){
            String text = "";
           for(Person m:persons) {
               text += m.toString() + "\n";
           } display.setText(text);
        }

        if(e.getSource().equals(clear)){
            display.setText(null);
        }

        if(e.getSource().equals(search)){
            String key = s.getText().toLowerCase();
            if(key.isEmpty()){
                display.setText("Search bar is empty! Enter the name you want you search...");
                return;
            }
            boolean found = false;
            for(Person m1 : persons){
                if(m1.name.toLowerCase().contains(key)){
                    display.setText(m1.toString());
                    found = true;
                    break;
                }
                if(!found) {display.setText("Not Found.");
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
class Person{
    int id;
    String name;
    String address;
    String phone;

    public Person(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "<"+id+">" + "<"+name+">" + "<"+address+">" + "<"+phone+">\n";
    }
}
