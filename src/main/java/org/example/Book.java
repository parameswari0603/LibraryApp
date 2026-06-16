package org.example;


public record Book(
        int id,
        String title,
        String author,
        double price
) {
}
