package class12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book>{
    String name;
    String id;
    String author;
    int publishing_year;

    public Book(String name, String id, String author, int publishing_year) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.publishing_year = publishing_year;
    }

    @Override
    public String toString() {
        return "<" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", publishing_year=" + publishing_year +
                '>'+"\n";
    }

    @Override
    public int compareTo(Book o) {
        if(this.publishing_year<o.publishing_year) return -1;
        else if(this.publishing_year>o.publishing_year) return 1;
        else return 0;
    }
}
public class Final_Prob_1 implements WindowListener, ActionListener {
    static ArrayList<Book> myList;
    Frame f;
    TextField search;
    Button s;
    TextArea ta;

    public Final_Prob_1() {

        f = new Frame("Search Library");
        search = new TextField("Enter the name of a book");
        s= new Button("Search");
        s.setActionCommand("search");
        ta = new TextArea();
    }

    public void lauchFrame(){
        search.setBounds(100,100,200,25);
        f.add(search);
        s.setBounds(100,150,200,25);
        s.addActionListener(this);
        f.add(s);
        ta.setBounds(100,200,200,200);
        f.add(ta);



        f.addWindowListener(this);
        f.setBackground(Color.GRAY);
        f.setLayout(null);
        f.setResizable(false);
        f.setSize(400,700);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();

        File inputFile = new File("books.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));

            String line;
            while((line = br.readLine())!= null){
                String[] info = line.split(",");
                Book b = new Book(info[0],info[1],info[2],Integer.parseInt(info[3]));
                list.add(b);
            }
            Collections.sort(list);
            System.out.println(list);
            myList = list;
            br.close();

            new Final_Prob_1().lauchFrame();


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("search")){
            String key = search.getText();

            for(Book b : myList){
                if(b.name.contains(key)) {
//                    System.out.println(b.toString());
                    ta.setText(b.toString());
                    return;
                }
            }
            ta.setText("Not Found");
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
