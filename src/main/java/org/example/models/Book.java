package org.example.models;

/**
 * Represents a library book.
 */
public class Book extends LibraryEntity
        implements Borrowable {

    private String title;
    private String author;
    private BookStatus status;

    public Book(int id,
                String title,
                String author,
                BookStatus status) {

        super(id);

        if(title == null || title.isBlank())
            throw new IllegalArgumentException("Title cannot be empty");

        if(author == null || author.isBlank())
            throw new IllegalArgumentException("Author cannot be empty");

        this.title = title;
        this.author = author;
        this.status = status;
    }

    @Override
    public void borrow() {
        status = BookStatus.BORROWED;
    }

    @Override
    public void returnBook() {
        status = BookStatus.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookStatus getStatus() {
        return status;
    }
}