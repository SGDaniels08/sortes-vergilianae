package com.sortesvergilianae.Storage;

import com.sortesvergilianae.Entities.Line;
import com.sortesvergilianae.Storage.Repositories.LineRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;

@Service
public class LineStorage {

    // Instance Variables
    private LineRepository lineRepo;

    // Controller
    public LineStorage(LineRepository lineRepo) {
        this.lineRepo = lineRepo;
    }

    // Other methods

    public Collection<Line> findAllLines() {
        return (Collection<Line>) lineRepo.findAll();
    }

    public Line findLineById(long id) {
        return lineRepo.findById(id).get();
    }

    public Line findRandomLine() {
        Random rndm = new Random();
        int lineSize =  (int) lineRepo.count();
        long randId = (long) rndm.nextInt(lineSize);
        return lineRepo.findById(randId).get();
    }

}
