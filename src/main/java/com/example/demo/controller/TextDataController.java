package com.example.demo.controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import com.example.demo.model.TextData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api")

public class TextDataController {
    private static List<Integer> ids = new ArrayList<>();
    private static List<TextData> texts = new ArrayList<>();
    private int lastId = 0;

    @GetMapping("/texts")
    public List<TextData> getTexts() { return texts; }

    @GetMapping("/ids")
    public List<Integer> getIds() { return ids; }

    @GetMapping("/texts/{id}")
    public TextData getTextById(@PathVariable("id") int id) {
        for(TextData td: texts) {
            if(td.getId()==id) {
                return td;
            }
        }
        return null;
    }

    @GetMapping("/lastId")
    public int getLastId() { return lastId; }
    
    @PostMapping("/add")
    public TextData addText(@RequestBody TextData td) {
        texts.add(td);
        ids.add(td.getId());
        lastId = td.getId();
        return td;
    }
}