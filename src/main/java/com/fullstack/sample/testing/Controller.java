package com.fullstack.sample.testing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class Controller {

    @Autowired
    private SampleRepository repo;

    @PostMapping("/add")
    public SampleEntity addUser(@RequestBody SampleEntity user) {
        return repo.save(user);
    }

    @GetMapping("/getdata")
    public List<SampleEntity> getAllUsers() {
        return repo.findAll();
    }
}
