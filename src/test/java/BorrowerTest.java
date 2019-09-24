import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book1;
    Library library;

    @Before
    public void before(){
        library = new Library(2000);
        borrower = new Borrower("Jim Broadbent");
        book1 = new Book("The Borrowers", "Mary Norton", "Fantasy");
    }

    @Test
    public void numberOfBooksInCollection(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void borrowBookFromLibrary(){
        library.addBook(book1);
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookCount());
    }
}
