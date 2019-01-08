import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        book1 = new Book("War and Peace", "Leo Tolstoy", "Historical");
        book2 = new Book("The Innocent Man", "John Grisham", "True Crime");
        library = new Library(2);
    }


    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void hasACapacityForBooks(){
        assertEquals(2, library.totalCapacity());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void cantAddBooksWhenLibraryIsFull(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countBooks());
        library.removeBook();
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canCountBooksByGenre(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countBooks());
        assertEquals(1, library.numberOfBooksByGenre("Historical"));
    }

}

