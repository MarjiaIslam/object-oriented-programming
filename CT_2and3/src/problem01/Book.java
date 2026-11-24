package problem01;

public class Book {
    private String title;
    private String ISBN;
    private String Author;
    private String dateOfPublish;

    public Book(String title, String ISBN, String author, String dateOfPublish) {
        this.title = title;
        this.ISBN = ISBN;
        Author = author;
        this.dateOfPublish = dateOfPublish;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return Author;
    }

    public String getDateOfPublish() {
        return dateOfPublish;
    }
}
class MyLibrary {
    Book[] collection = new Book[5];

    public void addBook(Book b) throws DuplicateItemException {
        for (int i = 0; i < 5; i++) {
            if(collection[i]==null)
                collection[i] = b;

            if (collection[i]!=null && (b.getTitle() == collection[i].getTitle()) && (b.getISBN() == collection[i].getISBN())) {
                throw new DuplicateItemException("This book is already included in the collection.");
            }


        }
    }

    public Book SearchBook(String title) throws ItemNotFoundException {
int i;
        for ( i = 0; i < 5; i++) {
            if (collection[i] != null && collection[i].getTitle() == title)
                return collection[i];
            else if (collection[i] != null && collection[i].getTitle() != title) {
                throw new ItemNotFoundException("The item being searched does not exist in the collection.");
            }
           // throw new ItemNotFoundException("The item being searched does not exist in the collection.");
        } return collection[i];
    }

    public static void main(String[] args) {
        MyLibrary m = new MyLibrary();
        Book a = new Book("To kill a mocking bird","8123","Haper Lee", "05-11-1960");
        Book b = new Book("The great gatsby","1212","F.scott", "26-04-1967");
        Book c = new Book("One hundred years of solitude","9280","Gabriel", "13-11-1976");
        Book d = new Book("The great gatsby","1212","F.scott", "26-04=1967");
        try {
            m.addBook(a);
            m.addBook(b);
            m.addBook(c);
            m.addBook(d);
        } catch (DuplicateItemException e) {
            System.out.println(e.getMessage());
        }
        try{
            m.SearchBook("One hundred years of solitude");
            m.SearchBook("Brave new World");
        }catch (ItemNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

}
class DuplicateItemException extends Exception {
    public DuplicateItemException(String message) {
        super(message);
    }
}
class ItemNotFoundException extends Exception{
    public ItemNotFoundException(String message) {
        super(message);
    }
}
