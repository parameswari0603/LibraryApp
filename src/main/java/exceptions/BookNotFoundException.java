package exceptions;

public class BookNotFoundException extends Exception {

    public BookNotFoundException(int bookId) {
        super("Book with ID " + bookId + " not found.");
    }
}
