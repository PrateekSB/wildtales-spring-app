package org.wildtales.wildtalesspringapp.service;

import org.springframework.stereotype.Service;
import org.wildtales.wildtalesspringapp.model.Tale;
import org.wildtales.wildtalesspringapp.respository.TalesRepository;

import java.util.List;

@Service
public class TalesService {
    private final TalesRepository talesRepository;

    public TalesService(TalesRepository talesRepository) {
        this.talesRepository = talesRepository;
    }

    public List<Tale> getAllTales() {
        return talesRepository.findAll();
    }
}
