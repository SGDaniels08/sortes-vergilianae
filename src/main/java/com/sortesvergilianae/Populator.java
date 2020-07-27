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
        // Create books
        Book book1 = new Book(1);
        Book book2 = new Book(2);
        Book book3 = new Book(3);
        Book book4 = new Book(4);
        Book book5 = new Book(5);
        Book book6 = new Book(6);
        Book book7 = new Book(7);
        Book book8 = new Book(8);
        Book book9 = new Book(9);
        Book book10 = new Book(10);
        Book book11 = new Book(11);
        Book book12 = new Book(12);
        bookRepo.save(book1);
        bookRepo.save(book2);
        bookRepo.save(book3);
        bookRepo.save(book4);
        bookRepo.save(book5);
        bookRepo.save(book6);
        bookRepo.save(book7);
        bookRepo.save(book8);
        bookRepo.save(book9);
        bookRepo.save(book10);
        bookRepo.save(book11);
        bookRepo.save(book12);

        // Create lines
//        File file = new File("c:/Users/SGDan/Desktop/Code/sortes-vergilianae/src/main/resources/Aeneid/book1.txt");
//        Scanner libLeg = new Scanner(file);


        String verse1 = "Arma virumque canō, Trōiae quī prīmus ab ōrīs";
        String verse2 = "Ītaliam, fātō profugus, Lāvīniaque vēnit";
        String verse3 = "lītora, multum ille et terrīs iactātus et altō";
        String verse4 = "vī superum saevae memorem Iūnōnis ob īram;";
        String verse5 = "multa quoque et bellō passūs, dum conderet urbem,";

        Line line1 = new Line(1, book1, verse1);
        Line line2 = new Line(2, book1, verse2);
        Line line3 = new Line(3, book1, verse3);
        Line line4 = new Line(4, book1, verse4);
        Line line5 = new Line(5, book1, verse5);
        lineRepo.save(line1);
        lineRepo.save(line2);
        lineRepo.save(line3);
        lineRepo.save(line4);
        lineRepo.save(line5);

/*        while (libLeg.hasNextLine()) {
            verse = libLeg.nextLine();
            line = new Line(lineNumber, book1, verse);
            lineRepo.save(line);
            lineNumber++;
        }

        /*
            for each book:
            read through book file; save a line to a variable
            save that variable to repo
         */
    }
}
