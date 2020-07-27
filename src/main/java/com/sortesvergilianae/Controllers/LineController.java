package com.sortesvergilianae.Controllers;

import com.sortesvergilianae.Entities.Line;
import com.sortesvergilianae.Storage.LineStorage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class LineController {
    // Instance Variable
    private LineStorage lineStorage;

    // Constructor
    public LineController(LineStorage lineStorage) {
        this.lineStorage = lineStorage;
    }

    // Getter
    public LineStorage getLineStorage() {
        return lineStorage;
    }

    //Other methods
    @GetMapping("/api/lines")
    public Collection<Line> findAllLines() {
        return lineStorage.findAllLines();
    }

    @GetMapping("api/lines/{id}")
    public Line findLineById(@PathVariable long id) {
        return lineStorage.findLineById(id);
    }

    @GetMapping("api/lines/random")
    public Line findRandomLine() {
        return lineStorage.findRandomLine();
    }
}
