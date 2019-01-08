import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("War and Peace", "Leo Tolstoy", "Historical");
        borrower = new Borrower(1);
    }

    @Test
    public void canCountBooksOnLoan(){
        assertEquals(0, borrower.numberOfBooksOnLoan());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
        borrower.borrowBookFromLibrary(library);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.numberOfBooksOnLoan());
    }
}
