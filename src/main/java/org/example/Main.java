package org.example;

import org.example.models.*;
import java.util.ArrayList;
import java.util.List;
import org.example.models.BookStatus;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(
                new Book(
                        1,
                        "the art of letting go",
                        "ram",
                        2008));

        books.add(
                new Book(
                        2,
                        "next to you",
                        "james",
                        2018 ));

        books.add(
                new Book(
                        3,
                        "snowflake",
                        "Garret",
                        2022));

        System.out.println("Before Sorting");

        books.forEach(
                b -> System.out.println(b.getTitle())
        );

        BookSorter.sortByTitle(books);

        System.out.println("\nSorted By Title");

        books.forEach(
                b -> System.out.println(b.getTitle())
        );

        System.out.println("\nBooks after 2010");

        books.stream()
                .filter(b -> b.getYear() > 2010)
                .forEach(b -> System.out.println(b.getTitle()));
        System.out.println("\nTitles Only");

        books.stream()
                .map(Book::getTitle)
                .forEach(System.out::println);
        List<String> titles =
                books.stream()
                        .map(Book::getTitle)
                        .toList();

        System.out.println("\nCollected Titles");
        System.out.println(titles);
        BookSorter.sortByAuthor(books);

        System.out.println("\nSorted By Author");

        books.forEach(
                b -> System.out.println(
                        b.getAuthor() + " - " + b.getTitle()
                )
        );
        BookSorter.sortByYear(books);

        System.out.println("\nSorted By Year");

        books.forEach(
                b -> System.out.println(
                        b.getYear() + " - " + b.getTitle()
                )
        );
    }

}