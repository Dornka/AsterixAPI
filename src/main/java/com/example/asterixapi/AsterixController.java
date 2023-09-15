package com.example.asterixapi;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/asterix")
public class AsterixController {

    private CharacterRepository repo;

    public AsterixController(CharacterRepository characterRepository){
        this.repo = characterRepository;
    }

    @GetMapping("/characters")
    public List<Character> getAllCharacters() {
        return repo.findAll();
    }
}