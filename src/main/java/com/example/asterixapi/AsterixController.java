package com.example.asterixapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/asterix")

public class AsterixController {

    private CharacterRepository Repo;

    public AsterixController(CharacterRepository characterRepository){
        this.Repo = Repo;
    }

    @GetMapping("/characters")
    public List<Character> getAllCharacters() {
        return Repo.findAll();
    }
}