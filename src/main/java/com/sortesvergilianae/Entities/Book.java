package com.sortesvergilianae.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;
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

    // Getters

    public long getId() {
        return id;
    }

    public Collection<Line> getLines() {
        return lines;
    }

    // Other methods
    public Line findRandomLine() {
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(lines.size());
        List randLines = (List) lines;
        return (Line) randLines.get(randomIndex);
    }
}
