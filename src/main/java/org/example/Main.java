package org.example;

import org.example.models.*;

public class Main {

    public static void main(String[] args) {

        Book book =
                new Book(
                        101,
                        "Clean Code",
                        "Robert Martin",
                        BookStatus.AVAILABLE);

        Member member =
                new Member(
                        1,
                        "Ram",
                        "ram@gmail.com");

        Loan loan =
                new Loan(
                        book,
                        member);

        Repository<Book> repository =
                new Repository<>();

        repository.add(book);

        System.out.println("Book Created");
        System.out.println("Member Created");
        System.out.println("Loan Created");
        System.out.println("Repository Working");
    }
}