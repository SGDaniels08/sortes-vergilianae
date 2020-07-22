package com.sortesvergilianae.Storage;

import com.sortesvergilianae.Entities.Book;
import com.sortesvergilianae.Storage.Repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BookStorage {

    // Instance Variables
    private BookRepository bookRepo;

    // Controller
    public BookStorage(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    // Other methods
    public Collection<Book> findBookById(long id) {
        return (Collection<Book>) bookRepo.findById(id).get();
    }

}
