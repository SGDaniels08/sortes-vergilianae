package com.sortesvergilianae.Controllers;

import com.sortesvergilianae.Entities.Book;
import com.sortesvergilianae.Entities.Line;
import com.sortesvergilianae.Storage.BookStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

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
    public Collection<Book> getAllBooks() {
        return bookStorage.findAllBooks();
    }

    @GetMapping("/api/books/{id}")
    public Book getSingleBook(@PathVariable long id) {
        Book bookToShow = bookStorage.findBookById(id);
        return bookToShow;
    }

    @GetMapping("/api/books/{bookId}/line")
    public Line getRandomLine(@PathVariable long bookId) {
        Book bookToShow  = bookStorage.findBookById(bookId);
        return bookToShow.findRandomLine();
    }
}
