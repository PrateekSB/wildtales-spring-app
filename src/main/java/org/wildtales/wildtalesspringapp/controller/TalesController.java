package org.wildtales.wildtalesspringapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wildtales.wildtalesspringapp.dto.TaleDTO;
import org.wildtales.wildtalesspringapp.service.TalesService;

@RestController
@RequestMapping("/api/tales")
public class TalesController {
    private final TalesService talesService;

    public TalesController(TalesService talesService) {
        this.talesService = talesService;
    }

    @GetMapping
    public ResponseEntity getAllTales() {
        return ResponseEntity.ok(talesService.getAllTales());
    }

    @PostMapping
    public ResponseEntity createTale(@RequestBody TaleDTO tale) {

        talesService.save(tale);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
