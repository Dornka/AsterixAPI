package com.example.asterixapi;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Characters")
public class Character {

    String id;
    String name;
    int age;
    String profession;

    public Character(String id, String name, int age, String profession) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
