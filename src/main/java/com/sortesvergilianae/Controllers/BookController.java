package com.sortesvergilianae.Controllers;

import com.sortesvergilianae.Entities.Book;
import com.sortesvergilianae.Storage.BookStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    // Instance variables
    private BookStorage bookStorage;

    // Controller
    public BookController(BookStorage bookStorage) {
        this.bookStorage = bookStorage;
    }

    // Getter
    public BookStorage getBookStorage() {
        return bookStorage;
    }

    // Methods
    @GetMapping("/api/books")
    public Book getBookOne() {
        Book bookToShow = (Book) bookStorage.findAllBooks();
    }
    @GetMapping("/api/books/{id}")
    public Book getSingleBook(@PathVariable long id) {
        Book bookToShow = (Book) bookStorage.findBookById(id);
        return bookToShow;
    }
}
