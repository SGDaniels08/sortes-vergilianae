package com.sortesvergilianae.Storage;

import com.sortesvergilianae.Storage.Repositories.LotRepository;
import org.springframework.stereotype.Service;

@Service
public class LotStorage {

    // Instance Variable
    private LotRepository lotRepo;

    // Controller
    public LotStorage(LotRepository lotRepo) {
        this.lotRepo = lotRepo;
    }

}
