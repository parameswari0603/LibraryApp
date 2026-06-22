package org.example.models;

public class BookModelTest {

    private String id;
    private String title;
    private boolean available;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
