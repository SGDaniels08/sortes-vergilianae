package com.sortesvergilianae.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Line {

    // Instance Variables
    @Id
    @GeneratedValue
    private long id;
    private int lineNumber;
    @JsonIgnore
    @ManyToOne
    private Book book;
    private String verse;

    // Constructor
    protected Line() {}
    public Line(int lineNumber, Book book, String verse) {
        this.lineNumber = lineNumber;
        this.book = book;
        this.verse = verse;
    }

    // Getters
    public long getId() {
        return id;
    }
    public int getLineNumber() {
        return lineNumber;
    }
    public Book getBook() {
        return book;
    }
    public String getVerse() {
        return verse;
    }
}