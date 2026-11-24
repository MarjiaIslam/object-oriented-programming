package class11;


import class11.Book;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//
//        System.out.println(list.size());
//
//        list.add("UIU");
//        list.add("Bangladesh");
//        list.add("OOP");
//
//        list.add(1,"Hello");
////        list.remove(2);
//        list.remove("Bangladesh");
//        list.set(2, list.get(2)+ " Lab");
//        //
//        list.get(0);
//
//
//        System.out.println(list.size());
//
//        System.out.println(list);


        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("To Kill a Mockingbird", "8123", "Harper Lee", "05-11-1960"));
        library.add(new Book("The Great Gatsby", "1212", "F. Scott Fitzgerald", "26-04-1925"));
        library.add(new Book("One Hundred Years of Solitude", "9280", "Gabriel Márquez", "13-11-1967"));

        System.out.println(library.size());
        System.out.println(library);

    }
}
