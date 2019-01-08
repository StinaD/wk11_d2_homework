import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Great Expectations", "Charles Dickens", "Classic");
    }

    @Test
    public void canGetGenre(){
        assertEquals("Classic", book.getGenre());
    }

}

