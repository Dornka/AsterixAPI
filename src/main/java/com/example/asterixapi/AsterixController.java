package com.example.asterixapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.*;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/asterix")

public class AsterixController {

    @GetMapping("/characters")
    public List<Character> getAllCharacters() {
        return CharacterRepository.findAll();
    }
}