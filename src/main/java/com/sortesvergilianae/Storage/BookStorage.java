package com.sortesvergilianae.Storage;

import com.sortesvergilianae.Storage.Repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookStorage {

    // Instance Variables
    private BookRepository bookRepo;

    // Controller
    public BookStorage(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    // Other methods
}
