package com.sortesvergilianae.Storage;

import com.sortesvergilianae.Storage.Repositories.LineRepository;
import org.springframework.stereotype.Service;

@Service
public class LineStorage {

    // Instance Variables
    private LineRepository lineRepo;

    // Controller
    public LineStorage(LineRepository lineRepo) {
        this.lineRepo = lineRepo;
    }

    // Other methods
}
