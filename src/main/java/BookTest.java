import org.example.models.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shouldCreateBook() {

        Book book = new Book("B1", "Java Basics");

        assertEquals("B1", book.getId());
        assertEquals("Java Basics", book.getTitle());
        assertTrue(book.isAvailable());
    }
}