import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowerCollection;

    public Borrower(String name){
        this.name = name;
        this.borrowerCollection = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.borrowerCollection.size();
    }

    public void addBook(Book book) {
        this.borrowerCollection.add(book);
    }

    public void borrowBook(Library library, Book book) {
        if(library.removeFromCollection(book)!= null) {
            Book bookRemoved = library.removeFromCollection(book);
            this.addBook(bookRemoved);
        }
    }
}
