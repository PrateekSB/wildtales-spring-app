package org.wildtales.wildtalesspringapp.service;

import org.springframework.stereotype.Service;
import org.wildtales.wildtalesspringapp.configuration.TaleMapper;
import org.wildtales.wildtalesspringapp.dto.TaleDTO;
import org.wildtales.wildtalesspringapp.model.Tale;
import org.wildtales.wildtalesspringapp.respository.TalesRepository;

import java.util.List;

@Service
public class TalesService {
    private final TalesRepository talesRepository;
    private final TaleMapper mapper;

    public TalesService(TalesRepository talesRepository, TaleMapper mapper) {
        this.talesRepository = talesRepository;
        this.mapper = mapper;
    }

    public List<Tale> getAllTales() {
        return talesRepository.findAll();
    }

    public void save(TaleDTO tale) {
        Tale entityToSave = mapper.map(tale, Tale.class);
        talesRepository.save(entityToSave);
    }
}
