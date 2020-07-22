package com.sortesvergilianae;

import com.sortesvergilianae.Entities.Book;
import com.sortesvergilianae.Entities.Line;
import com.sortesvergilianae.Storage.Repositories.BookRepository;
import com.sortesvergilianae.Storage.Repositories.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Collection;
import java.util.Scanner;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    BookRepository bookRepo;
    @Autowired
    LineRepository lineRepo;

    @Override
    public void run(String... args) throws Exception {
        // Create lines
        File file = new File("/Aeneid/book1.txt");
        Scanner libLeg = new Scanner(file);

        Line line;
        int lineNumber = 1;
        String verse;

        while (libLeg.hasNextLine()) {
            verse = libLeg.nextLine();
            line = new Line(lineNumber, verse);
            lineRepo.save(line);
            lineNumber++;
        }
        Collection<Line> lines = (Collection<Line>) lineRepo.findAll();
        Book book1 = new Book(lines, 1);
        bookRepo.save(book1);
        /*
            for each book:
            read through book file; save a line to a variable
            save that variable to repo
         */

        // Create books
    }

}
