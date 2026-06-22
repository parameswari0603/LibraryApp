package exceptions;

public class BookAlreadyBorrowedException extends Exception {

    public BookAlreadyBorrowedException() {
        super("Book is already borrowed.");
    }
}
