package com.github.bernabaris.backend.controller;

import com.github.bernabaris.backend.entity.LanguageEntity;
import com.github.bernabaris.backend.repository.LanguageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
@RequiredArgsConstructor
public class LanguageController {

    private final LanguageRepository languageRepository;

    @GetMapping
    public List<LanguageEntity> getAllLanguages() {
        return languageRepository.findAll();
    }
}
