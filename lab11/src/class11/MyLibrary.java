package class11;

class Book {
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

public class MyLibrary {
    private Book[] collection = new Book[10];
    int n = -1;

    public void addBook(Book b) throws DuplicateItemException{
        for(int i = 0; i <= n; i++){
            if(collection[i].getTitle() == b.getTitle() && collection[i].getISBN() == b.getISBN()){
                throw new DuplicateItemException("This book is already included in the collection");
            }
        }
        n++;
        collection[n] = b ;
    }
    public Book searchBook(String title) throws ItemNotFoundException{
        for(int i = 0; i <= n; i++){
            if(collection[i].getTitle() == title){
                return collection[i];
            }
        }
        throw new ItemNotFoundException("The item being searched does not exist in the collection");

    }

    public static void main(String[] args) {
        MyLibrary ml = new MyLibrary();
        try {
            ml.addBook(new Book("To Kill a Mockingbird", "8123", "Harper Lee", "05-11-1960"));
            ml.addBook(new Book("The Great Gatsby", "1212", "F. Scott Fitzgerald", "26-04-1925"));
            ml.addBook(new Book("One Hundred Years of Solitude", "9280", "Gabriel Márquez", "13-11-1967"));
            ml.addBook(new Book("The Great Gatsby", "1212", "F. Scott Fitzgerald", "26-04-1925"));

            ml.searchBook("One Hundred Years of Solitude");
            ml.searchBook("The Brave New World");

        }catch (DuplicateItemException d){
            System.out.println(d.getMessage());
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
class DuplicateItemException extends Exception {
    public DuplicateItemException(String message) {
        super(message);
    }
}
class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}

