import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book1) {
        if(bookCount() < capacity) {
            this.bookCollection.add(book1);
        }
    }

    public Book removeFromCollection(Book book) {
        int index = this.bookCollection.indexOf(book);
        if(index >= 0){
            return this.bookCollection.remove(index);
        }
        return null;
    }
}
