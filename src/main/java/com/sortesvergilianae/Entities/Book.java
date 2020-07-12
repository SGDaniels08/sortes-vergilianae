package com.sortesvergilianae.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Book {

    // Instance variables
    @Id
    @GeneratedValue
    private long id;
    @OneToMany (mappedBy = "book")
    private Collection<Line> lines;

    // Constructor
    protected Book() {}
    public Book(Collection<Line> lines) {
        this.lines = lines;
    }

    // Getter

    public long getId() {
        return id;
    }
    public Collection<Line> getLines() {
        return lines;
    }

}
