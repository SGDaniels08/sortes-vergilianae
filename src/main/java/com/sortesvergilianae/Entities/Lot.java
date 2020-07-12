package com.sortesvergilianae.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Lot {

    // Instance Variables
    @Id
    @GeneratedValue
    private long id;
    private ArrayList<Line> sors;

    // Constructor
    protected Lot() {}
    public Lot(ArrayList<Line> sors) {
        this.sors = sors;
    }

    // Getter
    public ArrayList<Line> getSors() {
        return sors;
    }
}
