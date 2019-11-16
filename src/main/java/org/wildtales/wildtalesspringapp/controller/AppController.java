package org.wildtales.wildtalesspringapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wildtales.wildtalesspringapp.service.TalesService;

@RestController
public class AppController {
    private final TalesService talesService;

    public AppController(TalesService talesService) {
        this.talesService = talesService;
    }

    @GetMapping
    public ResponseEntity getAllTales(){
        return ResponseEntity.ok(talesService.getAllTales());
    }
}
