package com.javaapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SuppressWarnings("java:S5961")

@RestController
@RequestMapping("/shoes/")
public class ShoeController {
    private final ShoeRepository repository;

    @Autowired
    public ShoeController(ShoeRepository repository){
        this.repository = repository;
    }

    @GetMapping("/{model}")
    public Shoe getShoeByModel(@PathVariable("model") String model){
        return repository.findByModel(model);
    }
}
