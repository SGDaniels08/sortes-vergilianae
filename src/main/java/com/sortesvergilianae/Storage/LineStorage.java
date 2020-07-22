package com.sortesvergilianae.Storage;

import com.sortesvergilianae.Entities.Line;
import com.sortesvergilianae.Storage.Repositories.LineRepository;
import org.springframework.stereotype.Service;

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
    public Line findRandomLine() {
        Random rndm = new Random();
        long randId = rndm.nextLong();
        return lineRepo.findById(randId).get();
    }
}
