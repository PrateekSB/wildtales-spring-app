package org.wildtales.wildtalesspringapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.wildtales.wildtalesspringapp.dto.TaleDTO;
import org.wildtales.wildtalesspringapp.service.FileService;
import org.wildtales.wildtalesspringapp.service.TalesService;

@RestController
@RequestMapping("/api/tales")
public class TalesController {
    private final TalesService talesService;
    private final FileService fileService;

    public TalesController(TalesService talesService,
                           FileService fileService) {
        this.talesService = talesService;
        this.fileService = fileService;
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

    @PostMapping("/files/upload")
    public ResponseEntity uploadImage(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(fileService.uploadToCloduinary(file));
    }
}
