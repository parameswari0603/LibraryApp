package org.example.models;

import java.time.LocalDate;

/**
 * Represents a loan transaction.
 */
public class Loan {

    private Book book;
    private Member member;
    private LocalDate loanDate;

    public Loan(Book book,
                Member member)
    {
        if(book == null)
            throw new IllegalArgumentException("Book cannot be null");
        if(member == null)
            throw new IllegalArgumentException("Member cannot be null");
        this.book = book;
        this.member = member;
        this.loanDate = LocalDate.now();
    }
}
