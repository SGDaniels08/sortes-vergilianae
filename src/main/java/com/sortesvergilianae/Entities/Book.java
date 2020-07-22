package com.sortesvergilianae.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Random;

@Entity
public class Book {

    // Instance variables
    @Id
    @GeneratedValue
    private long id;
    @OneToMany(mappedBy = "book")
    private Collection<Line> lines;
    private int bookNumber;

    // Constructor
    protected Book() {
    }

    public Book(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    // Getter

    public long getId() {
        return id;
    }

    public Collection<Line> getLines() {
        return lines;
    }

    // Other Methods
    public Line findRandomLine() {
        int bookLength = lines.size();
        Random rnd = new Random(bookLength);
        Line[] bookLines = (Line[]) lines.toArray();
        return bookLines[rnd.nextInt()];
    }
}
