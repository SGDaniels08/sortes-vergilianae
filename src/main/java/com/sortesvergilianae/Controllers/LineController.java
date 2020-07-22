package com.sortesvergilianae.Controllers;

import com.sortesvergilianae.Storage.LineStorage;
import org.springframework.web.bind.annotation.RestController;

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

    // Mapping Methods
    GetMapping()
}
