import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("The Light Fantastic", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void booksInLibrary(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }
}
