package org.example.models;

import java.util.Comparator;
import java.util.List;

public class BookSorter {

    public static void sortByTitle(List<Book>books) {
        books.sort(
                Comparator.comparing(Book::getTitle)
        );
    }

    public static void sortByAuthor(List<Book> books)
    {
        books.sort
                (
                Comparator.comparing(Book::getAuthor)
        );
    }

    public static void sortByYear(List<Book> books)
    {
        books.sort
                (
                Comparator.comparing(Book::getYear)
        );
    }
}