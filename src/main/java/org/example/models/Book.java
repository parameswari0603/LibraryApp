package org.example.models;

public class Book extends LibraryEntity
        implements Borrowable {

    private String title;
    private String author;
    private BookStatus status;
    private int year;

    public Book(int id,
                String title,
                String author,
                int year,
                BookStatus status) {

        super(id);

        if(title == null || title.isBlank())
            throw new IllegalArgumentException("Title cannot be empty");

        if(author == null || author.isBlank())
            throw new IllegalArgumentException("Author cannot be empty");
        if(year <= 0)
            throw new IllegalArgumentException("Invalid year");

        this.title= title;
        this.author= author;
        this.status= status;
        this.year=year;

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
    public int getYear(){
        return year;
    }
    public BookStatus getStatus() {
        return status;
    }
}