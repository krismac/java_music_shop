import music_shop.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Music beginners", 5, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Music beginners", book.getName());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(5, book.getCostPrice());
}

    @Test
    public void hasSalePrice() {
        assertEquals(10, book.getSalePrice());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(5, book.calculateMarkup());
    }
}
