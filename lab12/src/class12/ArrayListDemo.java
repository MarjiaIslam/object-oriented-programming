package class12;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.size());

        list.add("UIU");
        list.add("Bangladesh");
        list.add("OOP");

        list.add(1,"Hello");
     // list.remove(2);
        list.remove("Bangladesh");
        list.set(2, list.get(2)+ " Lab");

        //list.get(0);


        System.out.println(list.size());

        System.out.println(list);


//        ArrayList<Book> library = new ArrayList<>();
//
//        library.add(new Book("To Kill a Mockingbird", "8123", "Harper Lee", "05-11-1960"));
//        library.add(new Book("The Great Gatsby", "1212", "F. Scott Fitzgerald", "26-04-1925"));
//        library.add(new Book("One Hundred Years of Solitude", "9280", "Gabriel Márquez", "13-11-1967"));
//
//        library.set(1, new Book("JAVA-The Complete Reference",
//                "83472","Herbert Schildt", "09-05-1990"));
//        System.out.println(library.size());
//        System.out.println(library);

        ArrayList<Student> classOfStudents = new ArrayList<>();

        classOfStudents.add(new Student(1234, "John Smitth"));
        classOfStudents.add(new Student(2569, "Helen Brown"));
        classOfStudents.add(new Student(1232, "Richard Dumb"));

        System.out.println(classOfStudents);

        Collections.sort(classOfStudents);

        System.out.println(classOfStudents);


    }
}
